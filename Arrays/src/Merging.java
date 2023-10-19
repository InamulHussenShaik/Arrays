import java.util.Scanner;
public class Merging 
{
    public static void main(String[] args) 
    {
	System.out.println("Enter array 1 and array 2 sizes :");
	Scanner scan = new Scanner(System.in);
	int arr1[] = new int[scan.nextInt()];
	int arr2[] = new int[scan.nextInt()];
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
	MergingApp m = new MergingApp();
	int res[] =m.merge(arr1,arr2);
	System.out.println("Array 1 Elements are...");
	for(int i=0 ; i<=arr1.length-1; i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("Array 2 Elements are...");
	for(int i=0 ; i<=arr2.length-1; i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	System.out.println("Merged array..");
	for(int i=0 ; i<res.length; i++)
	{
		System.out.print(res[i]+" ");
	}
    }
}
