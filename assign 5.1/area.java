class rectangle

{
    
double length,breadth;
  
rectangle(double a ,double b)
 
   {
  
              this.length=a;
  
              this.breadth=b;

    }
 
double area()

    {

         return (length*breadth);

    }

}

public class area

{

public static void main(String args[])

{
 
 rectangle r = new rectangle(10,20);
 System.out.println("Area is " + r.area());

}
}