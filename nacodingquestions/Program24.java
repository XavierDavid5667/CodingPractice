package nacodingquestions;

/**
 * Printing Odd and Even no. from the array.
 */
public class Program24 {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]%2==0){
                System.out.println("Even: "+intArray[i]);
            }else{
                System.out.println("Odd "+intArray[i]);
            }
        }

    }
}
