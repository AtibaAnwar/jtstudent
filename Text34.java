interface X{
  void call();
}
interface Y extends X{
  void show();
}
public class Text34 implements Y{
@Override 
  public void call(){
    System.out.println("Hello");
}
@Override 
  public void show(){
    System.out.println("hi");
}
public static void main(String args[]){
  X aa=new Text34();
  aa.call();
  ((Y)aa).show();
  }
}

