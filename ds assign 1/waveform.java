import java.util.*;
class WaveForm {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row,col,n,i,j=0,max=0,k=-1,n1;
    System.out.println("Enter number of rows and cols");
    row=sc.nextInt();
    col=sc.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter elements of array");
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row;i++)
    {
      if(k==-1)
      {
        for(k=0;k<col;k++)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      else
      {
        for(k=col-1;k>=0;k--)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      
    }
    
  }
}