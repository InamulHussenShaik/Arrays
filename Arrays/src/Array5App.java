import java.util.Scanner;

public class Array5App 
{
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		System.out.println("Enter array length: ");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array in forword direction ");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		System.out.println("Array in forword direction ");
		Array5 a = new Array5();
		a.BackwordArray(arr);
	}
}
