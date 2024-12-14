/*
Exception is cought by/ by zero
*/
import java.util.*;
class throws_block {
    public static void main (String args[])throws ArithmeticException{
        int a=10;
        int b=0;
        try{
        System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Exception is cought by"+e.getMessage());
        }
    }
}