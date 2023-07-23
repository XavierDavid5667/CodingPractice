package nacodingquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * How do you shuffle an array in Java.
 */
public class Program45 {
    public static void main(String[] args) {

        //Using Collections.shuffle()
        System.out.println("Shuffling the array using Collections Shuffle");
        Integer[] integerArray={1,2,3,4,5};
        List<Integer> list = Arrays.asList(integerArray);
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(integerArray);//used to return an Integer type of Array
        System.out.println(Arrays.toString(shuffledArray));

        //Shuffle Array using Random class
        System.out.println("Shuffling the array using Random class");
        Random random=new Random();
        for(int i=0;i<integerArray.length;i++) {
            int randomIndexToSwap = random.nextInt(integerArray.length);
            int temp=integerArray[randomIndexToSwap];
            integerArray[randomIndexToSwap]=integerArray[i];
            integerArray[i]=temp;
        }

        System.out.println(Arrays.toString(integerArray));

    }

}
