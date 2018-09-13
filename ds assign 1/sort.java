import java.util.*;
class Sort{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("Enter size of array.");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          arr[j]=arr[j]^arr[j+1];
          arr[j+1]=arr[j]^arr[j+1];
          arr[j]=arr[j]^arr[j+1];
        }
      }
    }
System.out.println("Sorted array is");
    for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}