import java.util.Scanner;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array Length :");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter array Elements :");
		for (int i=0; i<=arr.length-1; i++)
		{
		  arr[i]=scan.nextInt();
		}
		SlectionApp s = new SlectionApp();
		s.selectionLogic(arr);
		System.out.println("Array Elements After Sorting...");

		for (int x : arr) {

		System.out.print(x+" ");

		}

		}			
	}
