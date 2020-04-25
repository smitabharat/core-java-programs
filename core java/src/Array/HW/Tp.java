package Array.HW;

public class Tp 
{
static //	static int arr[]=new int[] {5,1,3,4,7};
//
//	
//	static int countTriplet(int n,int sum)
//	{
//		int ans=0;
//		for(int i=0;i<n-2;i++)
//		{
//		
//		for(int j=i+1;j<n-1;j++)
//		{
//			for(int k=j+1;k<n;k++)
//			//if(arr[i]+arr[j]+arr[k]==sum)
//			//{
//			//	System.out.println("Triplet is "+arr[i]+","+arr[j]+","+arr[k]+",");
//			//	return true;
//			//}
//				
//				if(arr[i]+arr[j]+arr[k]<sum)
//					ans++;
//		}
//	}
//		return ans;
//		
//	}
	
	boolean find3numbers(int A[],int arr_size,int sum)
	{
		int l,r;
	int ans=0;
	for(int i=0;i<arr_size-2;i++)
	{
	
	for(int j=i+1;j<arr_size-1;j++)
	{
		for(int k=j+1;k<arr_size;k++)
		{
		if(A[i]+A[j]+A[k]==sum)
		{
			System.out.println("Triplet is "+A[i]+","+A[j]+","+A[k]+",");
			return true;
		 }
			
//			if(arr[i]+arr[j]+arr[k]<sum)
//				ans++;
	}
	}
		//return false;
		
	}
	return false;
}
	
	
	
		
		public static void main(String[] args) 
		{
			Tp t=new Tp();
			int A[]= {5,1,3,4,7};
			int sum=12;
			int arr_size=A.length;
			find3numbers(A,arr_size,sum);
			
			//System.out.println(countTriplet(arr.length,sum));
			
			//Ex25AddTriplet e=new Ex25AddTriplet ();
			//int arr_size=e.length;
			//e.find3numbers(A,arr_size,sum);

		}

	}

