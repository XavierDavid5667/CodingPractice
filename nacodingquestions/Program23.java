package nacodingquestions;

import java.util.Arrays;

/**
 * Sorting the array without using built in sort methods. 4. Copy all the elements from one array to
 * another array.
 */
public class Program23 {
    public static void main(String[] args) {
        int[] intArray={10,98,23,45,56,34,53,23,12,15};
        int length= intArray.length;
        int temp=0;
        System.out.println("Arrays without sorting "+Arrays.toString(intArray));
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(intArray[j]>intArray[j+1]){
                    temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array :"+Arrays.toString(intArray));
        System.out.println("Old Array :"+Arrays.toString(intArray));
        int[] newArray=new int[intArray.length];
        System.arraycopy(intArray, 0, newArray, 0, newArray.length);
        System.out.println("New Array : "+Arrays.toString(newArray));


    }
}
