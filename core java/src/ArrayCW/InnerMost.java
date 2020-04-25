package ArrayCW;

import java.util.Scanner;

public class InnerMost {

	public static void main(String[] args) {
		int row_size, col_size,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Size");
		row_size=sc.nextInt();
		System.out.println("Enter coloumn size");
		col_size= sc.nextInt();
		System.out.println("Enter Element");
		int a[][]=new int [row_size][col_size];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if((i==0)||(j==0)||(i==a.length-1)||(j==a.length-1))
				{
					System.out.print(" ");
					sum=sum+a[i][j];
				}
			
				else
				{
					System.out.print(" Inner Most Element  "+a[i][j]);
				}				
			}
			System.out.println();						
		}		


	}

}
