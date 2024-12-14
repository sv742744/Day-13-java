/*
hello
good bye
hello
bye
*/
import java.util.*;
public class hierorical_inheritence{
    public static void main(String [] args){
        c s=new c();
        s.print();
        s.show();
        b v=new b();
        v.print();
        v.display();

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
class c extends a{
    public void show(){
        System.out.println("good bye");
    }
}