package ArrayCW;

import java.util.Scanner;

public class TP 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					a[j]='@';
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!='@'&&a[j]!='@')
				{
					System.out.println("{"+a[i]+","+a[j]+"}");
				}
			}
		}
	}

}
