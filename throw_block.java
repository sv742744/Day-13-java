/*
java.lang.Exception: error
*/
import java.util.*;
class throw_block {
    public static void main(String [] args){
        try{
            throw new Exception("error");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}