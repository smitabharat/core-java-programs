package Array.HW;


public class Reversearr 
{

	public static void main(String[] args) 
	{
		int i;
		int arr[]=new int[] {5,4,7,8,9};
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("reverse order");
		for( i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"");
		}
		
		
		

	}

}
