import java.util.*;
public class multilevel_inheritence{
    public static void main(String [] args){
        c s=new c();
        s.print();
        s.display();
        s.show();

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
class c extends b{
    public void show(){
        System.out.println("good bye");
    }
}