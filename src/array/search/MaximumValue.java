/*Max value */

package array.search;

public class MaximumValue {
public static void main(String[] args) {
	
	int[] arr = {10,33,19,45,47};
	int n = arr.length;
	int i=0,j=0;
	int temp=0;
	
	for(i=0;i<1;i++)
	{
		temp =i;
		for(j=i+1;j<n;j++)
		{
			if(arr[j]>arr[temp]) 
			{
				temp=j;
			}
		}
}
	System.out.println("Max Number found in array is " + arr[temp]);
	
}
}
