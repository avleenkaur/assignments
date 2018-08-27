class complex

{
 
 int real , imag;

 complex(int a ,int b)
  {
  
   this.real = a;
   this.imag = b;
 
  }

void display()
{
System.out.println(real + "+" + imag +"i");

}

}

class display
{

 public static void main(String args[])
  {
 
  complex obj = new complex(2,5);

  obj.display();

  }

}