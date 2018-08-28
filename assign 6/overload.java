class OverLoad
{ 
    public void fun()
    {
        System.out.println("NULL ARG");
    }
    public void fun(int a)
    {
        System.out.println("Integer\n"+a);
    }
    public void fun(float a)
    {
        System.out.println("Float\n"+a);
    }
 }
class Overloading{
    public static void main(String [] args)
    {
        OverLoad o = new OverLoad();
        o.fun();
        o.fun(67);
        o.fun(2.76f);
    }
}