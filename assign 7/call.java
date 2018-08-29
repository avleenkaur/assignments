class A
{
A()
{
System.out.println("Default Constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class call
{
public static void main (String args[]){
  A sc=new A(10);
}
}
