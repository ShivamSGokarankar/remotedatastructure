package array.sorting;

import java.util.Arrays;

public class QuickSortingMiddlePos {
		
	static void quickSort(Integer[] arr, int low, int high) {
		
if (arr == null || arr.length == 0){
            return;
        }
        
		if (low >= high){
            return;
        }
 
        
        
        int pivot = arr[low+(high-low)/2];
 
       
        int i = low, j = high;
        while (i <= j) 
        {
        	while (arr[i] < pivot) 
        	{
        		i++;
        	}
 
        	while (arr[j] > pivot) 
        	{
        		j--;
        	}
  
        	if (i <= j) 
        	{
        		swap (arr, i, j);
        			i++;
        			j--;
    		}
        }

	        if (low < j)
	        {
	        	System.out.print("QS 1 called with Low -"+ low +"& high -" +j);
	        	System.out.println();
	            quickSort(arr, low, j);
	        }
	        if (high > i)
	        {
	        	
	        	System.out.print("QS 2 called Low -"+i +"& high -" +high);
	        	System.out.println();
	            quickSort(arr, i, high);
	        }
		
	}
	
	  public static void swap (Integer array[], int x, int y)
	    {
	        int temp = array[x];
	        array[x] = array[y];
	        array[y] = temp;
	       System.out.println();
	        System.out.println("         " +Arrays.toString(array));
	    }
	  public static void main(String[] args) 
		{
		  
		Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90 };
		System.out.println("Input -: " +Arrays.toString(array));
	   
	    quickSort( array, 0, array.length - 1 );
	
	    System.out.println("Output -:" +Arrays.toString(array));
		}
}
	

