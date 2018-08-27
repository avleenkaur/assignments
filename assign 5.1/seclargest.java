import java.util.Scanner;
class SecondLargest

{
	
public static void main(String[] args)

{


int arr [] = new int[10];

int l = arr[0];

int secl = arr[0];

for(int i = 0 ; i < 10 ; i++)

{
Scanner sc = new Scanner (System.in);

int a = sc.nextInt();
          
arr[i] = a;
		
}
		
for (int i = 0; i < 10 ; i++)
{
       
if (arr[i] > l)
               
{
	
 secl = l;

l = arr[i];
          
} 
     
else if (arr[i] > secl)
 
{
		
  secl = arr[i];
    
}
		
}
 
		
System.out.println("\nSecond largest number is" + secl);
 
}

}