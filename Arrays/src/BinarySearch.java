import java.util.Scanner;
public class BinarySearch
{
  public static void main(String[] args) 
  {
	  System.out.println("Enter array length :");
	  Scanner scan = new Scanner(System.in);	
	  int arr[]= new int [scan.nextInt()];
	  System.out.println("Enter Array Elements :");
	  for (int i=0; i<=arr.length-1; i++)
	  {
		  arr[i]=scan.nextInt();
	  }
	  System.out.println("Enter key to search :");
	  int key = scan.nextInt();
	  int res = BinaryApp.binaryLogic(key,arr);
	  if( res>=0)
	  {
		  System.out.println("The Element at the position "+res);
	  }
	  else 
	  {
		  System.out.println("Element Not Foundd ");
	  }
}
}