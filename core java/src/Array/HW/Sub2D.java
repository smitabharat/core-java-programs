package Array.HW;
import java.util.*;

public class Sub2D
{

	public static void main(String[] args) 
	{
		int i,j;
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int mat3[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter matrix 1 elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter matrix 2 elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("subtracting elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat3[i][j]=mat1[i][j]-mat2[i][j];
			}
		}
		System.out.println("result of matrix -matrix is:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(mat3[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
