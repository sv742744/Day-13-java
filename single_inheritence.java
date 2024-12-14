/*
hello
bye
hello
*/
import java.util.*;
public class single_inheritence{
    public static void main(String [] args){
        b s=new b();
        s.print();
        s.display();
        a v=new a();
        v.print();

    }
}
class a{
    public void print(){
        System.out.println("hello");
    }
}
class b extends a{
    public void display(){
        System.out.println("bye");
    }
}