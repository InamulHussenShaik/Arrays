import java.util.Scanner;
public class Array2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter"+arr.length+" the Elements to store in an array ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=scan.nextInt();		
		}
		System.out.println("Array Contents are..");
		for(int a:arr)
		{
			System.out.print(a+5+" ");		
		}
	}

}
