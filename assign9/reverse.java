import java.util.Scanner;
public class reverse
{
public static void main(String[] x)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String s = sc.nextLine();  //string is immutable,cant be changed
StringBuilder r = new StringBuilder();  /*so we use string builder to make another string because it is not immutable.*/
r.append(s); //we add s in new empty string r
r = r.reverse();   //then we reverse the new string
System.out.println(r);
 }
}