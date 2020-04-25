package Array.HW;
import java.util.*;

public class Maxmin
{
	public static void main(String[] args)
	{
		int size;
		System.out.println("enter no of elements");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		System.out.println("enter"+size+"elements");
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
				}
		}
		System.out.println("greatest\t"+max);
		int min=a[0];
		for(int i=0;i<a.length;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
					
				}
			}
		System.out.println("smallest\t"+min);
		}
		
	}


