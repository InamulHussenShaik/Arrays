
public class MergingApp 
{
	int[] merge(int arr1[] , int arr2[])
	{
		int res[] = new int[arr1.length + arr2.length];
		int index =0;
	    for(int i=0; i<arr1.length; i++)
	    {
	    	res[index]=arr1[i];
	    	index++;
	    	
	    }
	    for(int i=0; i<arr2.length; i++)
	    {
	    	res[index]=arr2[i];
	    	index++;
	    
	    	
	    }
	    return res;
	}
	

}
