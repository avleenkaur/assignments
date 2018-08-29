class A{  
void function()
{
System.out.println(" Parent Class");
}  
}  
class B extends A{  
void function(){
System.out.println("Child Class");
}  
void fun(){
System.out.println("Calling Parent Class");
}  
void display(){ 
fun(); 
super.function();   
}  
}  
class invoke
{  
public static void main(String args[]){  
B sc=new B();  
sc.display();  
}
} 