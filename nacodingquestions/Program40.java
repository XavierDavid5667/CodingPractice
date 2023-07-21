package nacodingquestions;

/**
 * Find a greatest pair from Array
 */
public class Program40 {
    public static int[] findGreatestPair(int[] array){
       int firstLagrest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
        for(int num: array){
            if(num>firstLagrest){
                secondLargest=firstLagrest;
                firstLagrest=num;
            }else if(num>secondLargest){
                secondLargest=num;
            }
        }
        return new int[]{firstLagrest,secondLargest};
    }
    public static void main(String[] args) {
        int[] arr={12,5,27,9,20,15};
        int[] greatestPair=findGreatestPair(arr);
        System.out.println("The largest pair from the array is "+greatestPair[0]+" "+greatestPair[1]);
    }
}
