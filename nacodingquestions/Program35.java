package nacodingquestions;

import java.util.Arrays;

/**
 * Rotation of elements of array-left and right.
 */
public class Program35 {
    public static int[] rotateRight(int[] array){
        int[] newArray=new int[array.length];
        int temp=array[array.length-1];
        for(int i=0;i< array.length-1;i++){
            newArray[i+1]=array[i];
        }
        newArray[0]=temp;
        return newArray;
    }
    public static int[] rotateLeft(int[] array){
        int[] newArray=new int[array.length];
        int temp=array[0];
        for(int i=1;i< array.length;i++){
            newArray[i-1]=array[i];
        }
        newArray[array.length-1]=temp;
        return  newArray;
    }

    public static void main(String[] args) {
        int[] intArray={1,2,3,4,5,6,7,8};
        System.out.println("Actual array before rotation is"+Arrays.toString(intArray));
        int[] rightRotated=rotateRight(intArray);
        System.out.println("Right rotated array is "+ Arrays.toString(rightRotated));
        int[] leftRotated=rotateLeft(intArray);
        System.out.println("Left rotated array is "+Arrays.toString(leftRotated));
    }
}
