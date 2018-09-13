import java.util.*;
class MaxValue{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("max value in array is: "+max);
  }
}