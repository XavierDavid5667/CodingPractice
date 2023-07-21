package nacodingquestions;

public class Program34 {
    public static void main(String[] args) {
        int[] intArray={1,2,34,56,34,44,33,45,55,46,68};
        int even=0;
        int odd=0;
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The number of even numbers are "+even+" and the number of odd numbers are "+odd);
    }
}
