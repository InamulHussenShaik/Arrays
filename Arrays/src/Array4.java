import java.util.Scanner;
public class Array4 
{
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		System.out.println("Enter array length: ");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Before swaping :");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter two index values to swap: ");
		int m= scan.nextInt();
		int n= scan.nextInt();
		int help;
		help=arr[m];
		arr[m]=arr[n];
		arr[n]=help;
		for(int l:arr)
		{
			System.out.println("After swapping: "+l);	    
		}	    
	}
}