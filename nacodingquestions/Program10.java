package nacodingquestions;

/**
 * Write a program to find the difference between equals and ==
 */
public class Program10 {
    public static void main(String[] args) {
        String string1="Xavier";
        String string2="Xavier";
        String string3=new String("Xavier");
         if(string1==string2){
             System.out.println("string1 and string2 refer to the same location in the string constant pool");
         }else{
             System.out.println("string1 and string2 don't refer to the same location in the string constant pool");
         }
         if(string1==string3){
             System.out.println("string1 and string3 refer to the same location in the string constant pool");
         }else{
             System.out.println("string1 and string3 don't refer to the same location in the string constant pool");
         }
         if(string1.equals(string3)){
             System.out.println("Content in both the strings is the same");
         }else{
             System.out.println("Content in both the strings is not equal");
         }

    }
}
