// Class which can't be inherit
final class A{  
void display(){
System.out.println("Class A");
}                                       
}            
class B extends A{  
void display()
{
System.out.println("Class B");
}                                       
}
class extend
{
public static void main(String args[]){  
B sc= new B(); 
sc.display();
}
}


// We can't inherit Class A to B because Class A is declared with final