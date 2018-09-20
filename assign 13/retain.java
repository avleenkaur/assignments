import java.util.*;
class Retain
{
public static void main(String args[])
{
HashSet h1=new HashSet();
h1.add(15);
h1.add(26);
h1.add(84);
h1.add(58);
h1.add(11);

HashSet h2=new HashSet();
h2.add(11);
h2.add(26);
h2.add(58);
h2.add(55);
h2.add(99);

h1.retainAll(h2);
System.out.println(h1);
}
}