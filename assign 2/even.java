import java.util.Scanner;
class even
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("All even numbers till n are:");
for(int i=1;i<n;i++)

{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
