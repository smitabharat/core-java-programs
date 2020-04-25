package Array.HW;
import java.util.*;

public class Multiplication 
{

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base of squared of matrix");
		n=sc.nextInt();
		int[][]c=new int[n][n];
		System.out.println("enter the elements 1st matrix element in row wise");
		int[][]a=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the second matrix element in row wise");
		int[][]b=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++ )								
			{
				b[i][j]=sc.nextInt();
			}
		}
		/*
		 * System.out.println("the matrix is:"); for(int i=0;i<n;i++) { for(int
		 * j=0;j<n;j++) { c[i][j]=sc.nextInt(); } }
		 */
		
		
		System.out.println("Multiplying of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("the product is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
