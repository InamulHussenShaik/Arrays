//Write a java program to replace all the negative numbers 
//in an integer array to 0(zero).
import java.util.Scanner;
public class Array8 
{
   public static void main(String[] args) 
   {
	   System.out.println("Enter array size :");
	   Scanner scan = new Scanner(System.in);
	   int arr[] = new int[scan.nextInt()];
	   System.out.println("Enter array elements :");
	   for (int i=0 ; i<=arr.length-1; i++)
	
	   {
		   arr[i]=scan.nextInt();
	   }
	   TraceArray8App t = new TraceArray8App();
	   int finalArray[]= t.removingPositiveNumbers(arr);
	   for(int i=0; i<=arr.length-1; i++)
	   {
		   System.out.print(finalArray[i]+" ");
	   }
}
}
