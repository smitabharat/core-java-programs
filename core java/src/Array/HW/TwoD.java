package Array.HW;
import java.util.*;

public class TwoD 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		
		int a[][]=new int[row][];
		
		int c;
		for(int i=0;i<row;i++)
		{
			System.out.println("enter column for"+i); 
			c=sc.nextInt();
			a[i]=new int[c];
		}
		System.out.println("enter"+(a[0].length+a[1].length));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("length="+a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
		
		
		

	
