package Array.HW;

import java.util.Scanner;

public class Evenodd {

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
		
		System.out.println("odd numbers");
		for( i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			
				System.out.print(a[i]+" ");
			}
		System.out.println(" ");
		System.out.println("even numbers");
		for( i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		}
	

}
