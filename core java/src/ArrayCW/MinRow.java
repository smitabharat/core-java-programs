package ArrayCW;

import java.util.Scanner;

public class MinRow {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size of array");
		int row=sc.nextInt();
		System.out.println("enter the column size of array");
		int col=sc.nextInt();
		
	System.out.println("enter the elements");
	int a[][]=new int[row][col];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
			for(int i=0;i<a.length;i++)
			{
				int min=a[i][0];
				for(int j=0;j<a.length;j++)
				{
					if(a[i][j]<min)
					{
						min=a[i][j];
					}
				}
				System.out.println("minimum no is in row"+min);
			
	}
	}

}
