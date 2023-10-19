
public class TraceArray8App 
{
	int[] removingPositiveNumbers(int arr[])
	{
		for(int i=0 ; i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		return arr;
	}

}
