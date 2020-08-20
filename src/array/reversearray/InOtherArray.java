
//First array is reversed and then stored in other array 
package array.reversearray;
class ArrayGenerator{
	
	
	public int[] generateArray(int n2) {
		return new int[n2];
	}
	
	public void reverseArray(int n2,int arr[]) throws InterruptedException {
		int[] Rev =generateArray(n2);
		int temp ;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]= temp;
		}
		System.out.print("New Array In reversed order :");
		for(int i=0;i<arr.length;i++) {
		
			Rev[i]= arr[i];
			System.out.print(Rev[i]+ " ");
			Thread.sleep(200);	
		
	}
	
}
}

public class InOtherArray {
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int n1 = arr.length;
		ArrayGenerator g= new ArrayGenerator();
		g.reverseArray(n1,arr);
		
		
		
		
		
		
		
		
		
	}
	
	

}
