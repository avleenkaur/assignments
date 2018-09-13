import java.util.*;
class Reverse {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,i,j,max=0,k=0,n1;
    System.out.println("Enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements");
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(i=0,j=n-1;i<n/2;i++,j--)
    {
      arr[i]=arr[i]^arr[j];
      arr[j]=arr[i]^arr[j];
      arr[i]=arr[i]^arr[j];
    }
System.out.println("Reversed array:");
    for(i=0;i<n;i++)
    {
      System.out.println(" "+arr[i]);
    }
    
  }
}