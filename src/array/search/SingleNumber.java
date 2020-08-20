package array.search;

import java.io.IOException;
import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) throws InterruptedException, IOException {
		int[] arr = { 10, 20, 30, 40, 50, 60,10, 20, 30, 40, 50, 60,
				10, 20, 30, 40, 50, 60,10, 20, 30, 40, 50, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60
				, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60
				, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60
				, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60
				, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60
				, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60, 60,10, 20, 30, 40, 50, 60};
		int n = arr.length;

		System.out.print("Search Number :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Scanner sc1 = new Scanner(System.in);
		int numToFind= sc.nextInt();
		int i;
		sc1.close();
		for( i=0;i<n;i++)
		{


			if(i==n-1) {
				System.out.println();
				System.err.print("Done!!!!");

			}

			if(numToFind==arr[i])
				{
				
				Thread.sleep(200);

				System.out.println("Number Found At Index : '" +i + "'");


//					if(check==1)
//						{
//						System.out.println();
//						System.out.print("Do you want to search further ? [Y OR N]");
//						System.out.println();
//						String opinion=sc1.nextLine();
//
//						if(opinion.equals("N"))
//							{
//							sc1.close();
//							break;
//							}
//						if(opinion.equals("Y"))
//							{}
//						if(opinion.equals(""))
//							{
//							 System.out.println("You have not Answered!!!");
//							 i=n-2;
//
//							}
//						}
				 }



		}

	}

}
















