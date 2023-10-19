import java.util.Scanner;

public class Array7App 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter array size for two arrays : :");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter array 1 Elements: ");
		for(int i=0 ; i<=arr1.length-1; i++)
		{
			arr1[i]= scan.nextInt();
		}
		System.out.println("Enter array 2 Elements: ");
		for(int i=0 ; i<=arr2.length-1; i++)
		{
			arr2[i]= scan.nextInt();
		}
		Array7 a = new Array7();
		int arr3[]=a.ArraySum(arr1,arr2);
		System.out.println("Corresponding sum of the two arrays : "); 
		for(int i=0; i<=arr1.length-1; i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
