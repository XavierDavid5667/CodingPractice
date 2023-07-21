package nacodingquestions;

/**
 * Java program to check leap year
 */
public class Program19 {
    static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; //divisible by 4, if divisible by 100, then it should be divisible by 400,otherwise it is not a leap year
                } else {
                    return false;//divisible by 4 , and 100 but not 400=>Not leap year
                }
            } else {
                return true;// divisible by 4 by not by 100=> Leap year
            }
        }else{
            return false;// Not divisible by 4=>Not leap year
        }
    }
    public static void main(String []args){
        int Leapyear = 2024;
        boolean checkLeap= checkLeapYear(Leapyear);
        if(checkLeap){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }

    }
}
