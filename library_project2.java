/*
Lalitha You borrowed 1 book 
Lalitha You borrowed 2 book 
Lalitha You borrowed 3 book 
Lalitha you returned books and remaings books are: 2
*/
class library{
  String name;
  int bb;
  library(String name)
  {
    this.name=name;
    this.bb=0;
  }
  public boolean cb()
  {
    return false;
  }
  public void bob()
  {
    if(cb())
    {
      bb++;
      System.out.println(name+" You borrowed "+bb+" book ");
    }else{
      System.out.println("Your Limit Exceeded!");
    }
  }
  public void rb()
  {
    if(bb>0){
      bb--;
      System.out.println(name+" you returned books and remaings books are: "+bb);
    }else{
      System.out.println(name+" you didnot took any book form library");
    }
  }
}
class students extends library
{
  students(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<3;
  }
}
class teachers extends library
{
  teachers(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<10;
  }
}
public class library_project2 {
  public static void main(String[] args) {
      library a = new students("Amar");
      library b1 = new students("Lalitha");
      library b = new teachers("Dr.Prem Kumar");
      b1.bob();
      b1.bob();
      b1.bob();
      b1.rb();
  }
}