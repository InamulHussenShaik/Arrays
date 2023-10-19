//Binary Search 
import java.lang.reflect.Array;
class BinaryApp
{  
	public static int binaryLogic(int key, int arr[])
	{
		int low =0;
    	int high = Array.getLength(arr)-1;
    	int mid =0;
    	while(low<=high) 
    	{
    	mid =(low+high)/2;
    	if(arr[mid]==key) 
    	{
    	  return mid;	
    	}
    	else if(arr[mid]<key)
    	{
    		low = mid+1;
    	}
    	else 
    	{
    		high = mid-1;
    		
    	}
	}
		return -5;
	}
}