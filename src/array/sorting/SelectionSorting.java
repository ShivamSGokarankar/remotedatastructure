/*Selection sort */
package array.sorting;

public class SelectionSorting {
	
	public static void main(String[] args) {
		
	
	int[] a = {5,3,1,2,4};
	int n = a.length;
	int min,temp,j,i;
	
	for(i=0;i<n;i++)
	{
		
		min=i;
		for(j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;

				}
			}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
//	System.out.println("Sorted array is : ");
//	for(int k : a)
//	{
//		System.out.print(" " + k);
//	}

}
}
