package array.reversearray;


class ArrayGenerator2{
	
	public int[] generateArray(int n2) {
		return new int[n2];
	
	}
	
	public void reverseArray(int arr[],int n) {
		int j =n;
		int[] Rev =generateArray(n);
		System.out.println("Reversed new array : ");
		for(int i=0;i<n;i++) {
			Rev[j-1]=arr[i];
			j=j-1;
			
		}
		for(int i :Rev) {
			System.out.println(i);
		}
	}

}
public class InsideOtherArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int n1 = arr.length;
		ArrayGenerator2 g= new ArrayGenerator2();
		g.reverseArray(arr,n1);
		

	}

}
