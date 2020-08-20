/*..............Bubble Sort................*/
package array.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {5,3,1,2,4};
		int n = arr.length;
		int i ,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++) 
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j+1];
				arr[j+1]= arr[j];
				arr[j]=temp;
				}
				
			}
			
		}
		for(int k:arr) {
			System.out.print(" "+k);
		}
		System.out.println();
		System.out.println("By direct method -");
		//direct function
		Arrays.sort(arr);
		System.out.println(" " +Arrays.toString(arr) );
		
		
	}

}
