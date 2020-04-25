package Array.HW;
import java.util.*;

public class EvOdex15
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		System.out.println("enter"+size+"elements");
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
		 a[i]=sc.nextInt();
		}
		
		int k=0;
		System.out.println("the number is even");
		for(k=0;k<a.length;k++)
		{
			if(a[k]%2==0)
			{
				System.out.println(a[k]);
			}
		}
		System.out.println("the num is odd");
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			{
				System.out.print(a[j]);
			}
			//System.out.println(a[k]+a[j]);
		}
		
		}
	

}
