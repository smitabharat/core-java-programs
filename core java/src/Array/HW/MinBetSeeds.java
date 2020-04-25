package Array.HW;
import java.util.*;

public class MinBetSeeds
{
	
	public static void findMinDistance(int[]arr,int arr_len,int m,int n)
	{
		int a,b,len=1000;
		for(int i=0;i<arr_len;i++)
		{
			for(int j=i+1;j<arr_len;j++)
			{
				if(m==arr[i]&& n==arr[j]||m==arr[j]&& n==arr[i])
				{
					if(len>(j-i))
                    len=j-i;
				}
			}
		}
		System.out.println("min distance is\t"+len);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(" enter m and n elements");
		int a=sc.nextInt();
		int b=sc.nextInt();
		findMinDistance(arr,n,a,b);
		

	}

	

}
