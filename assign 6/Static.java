import java.util.*;
import java.lang.*;
class Static
{
static void example1()
{
System.out.print("static");
}
void example2()
{
System.out.print("block example!");
}
public static void main(String [] aa)
{
Static sc=new Static();
example1();
sc.example2();
}
}