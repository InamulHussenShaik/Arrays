import java.util.Scanner;
public class Array1 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" the Ele5ments to store in an array ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=scan.nextInt();		
		}
		System.out.println("Array Contents are..");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);		
		}
	}

}
