/*
bad request
catch block is running
finnally is running
*/
import java.util.*;
class try_catch_block{
    public static void main(String args[]){
        try{
            int d=90/0;
        }
        catch(ArithmeticException e){
            System.out.println("bad request");
        }
        try{
            int d=90/0;
        }
        catch(ArithmeticException e){
            System.out.println("catch block is running");
        }
        finally{
            System.out.println("finnally is running");
        }
         
    }
}