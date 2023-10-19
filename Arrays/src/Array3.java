import java.util.Scanner;
public class Array3 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter array length");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		System.out.print("Enter array values:");
		for(int j=0; j<arr.length; j++)
		{
			arr[j]=scan.nextInt();	
		}
		System.out.println("All positive integers are: ");
		for(int x:arr)
		{
			if(x>=0)
			{
				System.out.print(x+" ");
			}
		}
	}
}
