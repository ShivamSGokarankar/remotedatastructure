/*Min value */

package array.search;

public class MinimumValue {
public static void main(String[] args) {
	
	int[] arr = {100,33,32,65,78,2126,84,51,85,96,36,75,25,12,19,47,45};
	int n = arr.length;
	int i;
	int Min;
	Min = arr[0];
	for(i=1;i<n;i++)
	{
		if(arr[i]<Min)
		{
			Min=arr[i];
		}
	}
	System.out.println("Max Number found in array is " + Min+ " " );
	
}
}
