import java.util.*;
class SearchElement
{
  public boolean Search(int arr[],int num){
    int i;
    if(arr.length==0)
    return false;
    int subarr[]=new int[arr.length-1];
    for(i=1;i<arr.length;i++)
    {
      subarr[i-1]=arr[i];
    }
    if(arr[0]==num)
    return true;
    else
    return Search(subarr,num);
  }
  public static void main(String[] args) {
    SearchElement m=new SearchElement();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    System.out.println("enter element to search");
    num=o.nextInt();
    boolean b=m.Search(arr,num);
    System.out.println(b);
  }
}