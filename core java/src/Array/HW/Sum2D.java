package Array.HW;
import java.util.*;

public class Sum2D 
{

	public static void main(String[] args)
	{
		int j;
		Scanner sc=new Scanner(System.in);
		int a[][]={ {1,2},{2,3}};
		int b[][]={{1,3},{2,1}};
		
		int c[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			
			for( j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
	

}
