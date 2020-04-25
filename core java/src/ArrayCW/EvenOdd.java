package ArrayCW;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number"+a[i]);
			}
			else
			{
				System.out.println("odd number"+a[i]);
			}
		}
		
	}

}
