package array.sorting;

public class AILearnsSorting {

	public void print(int[] a) throws InterruptedException
	{
		System.out.println();
		System.err.println("Sorted by AI agent");
		for(int k:a)
		{
			Thread.sleep(150);
			System.out.print(k + " ");
		}
	}
	
	
	public  int[] divide(int a[]) throws InterruptedException
	{
		Thread.sleep(150);
		if(a.length<=1)
		{
			return a;
		}
		 int mid;
		mid=a.length/2;
		 int[] left= new int[mid];
		 int[] right;
		 if(a.length % 2== 0)
		 {
			 right=new int[mid];
		
		 }
		 else 
			 {
			 right=new int[a.length-mid];
			 }
		
		
		for(int i=0;i<mid;i++)
			{
			left[i]=a[i];
			Thread.sleep(100);
			System.out.print(left[i]+ " ");
			}
		for(int h=1;h<4;h++)
		{
			Thread.sleep(100);
			System.out.print("<");
		}
		System.out.print(" ");
		for(int h=1;h<4;h++)
		{
			Thread.sleep(150);
			System.out.print(">");
		}
		
		for(int j=0;j<right.length;j++)
			{
			right[j]=a[mid+j];
			Thread.sleep(150);
			System.out.print(" "+right[j] );
			}
		
		System.out.println();
		int[] result = new int[a.length];
		left=divide(left);
		
		right=divide(right);
		
		result=merge(left,right);
		
		return result;
		
	}
	
	public int[] merge(int[] left,int[] right) throws InterruptedException
	{
		int[] result = new int[left.length+right.length];
		int leftIndex,rightIndex,resultIndex;
		leftIndex=rightIndex=resultIndex=0;
		
		while(leftIndex<left.length || rightIndex<right.length)
		{
			
			if(leftIndex <left.length && rightIndex<right.length)
			{
				if(left[leftIndex]<right[rightIndex])
				{
					
					result[resultIndex++]=left[leftIndex++];
					
				}
				else
				{
					
					result[resultIndex++]=right[rightIndex++];
					
				}
			}
			else if(leftIndex<left.length)
			{
				
				result[resultIndex++]=left[leftIndex++];
				
			}
			else if(rightIndex<right.length)
			{
				
				result[resultIndex++]=right[rightIndex++];
			}
		}
		return result;
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		AILearnsSorting ms = new AILearnsSorting();
		
		int[] a = {	3,8,75,13,53,65,47,85,44,77,66,89,18,73,06,79,62,36,54,12,87,9,23,54,37,11};
		System.out.println("Given List is : ");
		for(int g:a)
		{
			System.err.print(g + " ");
			Thread.sleep(150);
		}
		System.out.println();
		a =ms.divide(a);
		System.out.println();
		ms.print(a);
		
	}

}
