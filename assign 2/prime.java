import java.util.Scanner; 
class Prime {
public static void main(String args[]){
int n, count;
Scanner sc = new Scanner(System.in);
System.out.print("enter n ");
n=sc.nextInt();
System.out.println("all prime numbers till n " + n);
for (int i = 2; i <= n; i++) {
count = 2;
for (int j = 2; j < i; j++) {
if (i % j == 0)
count++;
}
if (count == 2)
{
System.out.print(i + " ");
}
}
}
}