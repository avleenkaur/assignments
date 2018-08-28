class animal
{
String breed;
String color;
void speak()
{
System.out.println("Growl");
}
public static void main(String args[])
{
animal a=new animal();
dog d=new dog();
cat c=new cat();
a.speak();
d.speak();
c.speak();
}
}
class dog extends animal
{
String breed;
String color;
void speak()
{
System.out.println("bark");
}
}
class cat extends animal
{
String breed;
String color;
void speak()
{
System.out.println("meow");
}
}