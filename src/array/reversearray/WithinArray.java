package array.reversearray;

public class WithinArray {

	public static void main(String[] args) throws InterruptedException {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int n = arr.length;
		int temp;
		System.out.print("Given    :");
		
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
			Thread.sleep(200);
		}
		 
		System.out.print('\n');
		System.out.print("Reverse  :");

		for (int i = 0; i < n / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(" " +arr[i]);
			Thread.sleep(200);
		}
		 
	}

}
