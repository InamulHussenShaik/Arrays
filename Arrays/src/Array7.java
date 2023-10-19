public class Array7 
{
	int[] ArraySum(int arr1[],int arr2[])
	{
		int res[]=new int[arr1.length];
		for(int i=0 ; i<=arr1.length-1; i++)
		{
			res[i]=arr1[i]+arr2[i];
		}
		return res;
	}
}
