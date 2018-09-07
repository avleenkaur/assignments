import java.util.Scanner;
public class reverse
{
public static void main(String[] x)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String s = sc.nextLine();
StringBuilder r = new StringBuilder();
r.append(s);
r = r.reverse();
System.out.println(r);
 }
}