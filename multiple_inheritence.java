/*
HELLO I'am parent 1 class
HELLO I'am  parent 2 class
*/
import java.util.*;
interface a{
    public void p();
}
    interface b {
    public void p1();
}
class c implements b,a{
    public void p(){
        System.out.println("HELLO I'am parent 1 class");
    }
    public void p1(){
        System.out.println("HELLO I'am  parent 2 class");
    }
}
public class multiple_inheritence{
        public static void main(String args[]){
            // multiple inheritance
            c t=new c();
            t.p();
            t.p1();
        }
}