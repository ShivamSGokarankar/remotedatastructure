package array.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] a = {5,3,1,2,4};
		int n = a.length;
		int hole,i,value;
		
		for(i=1;i<n;i++)
		{
			value=a[i];
			hole=i;
			while(hole>0 && a[hole-1]>value)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=value;
			
		}
		System.out.print("By insertion sort mehtod : ");
		for(int k:a )
		{
			System.out.print(k + " ");
		}
	}

}
