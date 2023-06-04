interface A{
void call();
void show();
void fun();
}
public class Text35{
public static void main(String args[]){
A aa=new A(){
@Override 
public void call(){
System.out.println("Hello");
}
@Override
public void show(){
System.out.println("HII");
}
@Override 
public void fun(){
System.out.println("Bye");
}
};
aa.call();
aa.show();
aa.fun();
}
}