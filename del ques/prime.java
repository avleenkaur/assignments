import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int n = sc.nextInt();
int count=0,i;
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
count=1;
break;
}
}
if(count==0)
{
System.out.println("It is a prime number");
}
else
{
System.out.println("It is not a prime number");
}
}
}