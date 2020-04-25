package Array.HW;
import java.util.*;

public class SumDiagonal 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,col,row,sum=0;
		System.out.println("enter the no of rows");
		row=sc.nextInt();
		System.out.println("enter the no of columns");
		col=sc.nextInt();
		
		int[][] mat=new int[row][col];
		System.out.println("enter the elements of matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
	
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println(" ");
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(i==j)
				{
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println("sum of diagonal elements "+sum);

	}

}
