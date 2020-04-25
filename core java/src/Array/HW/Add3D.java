package Array.HW;

import java.util.Scanner;

public class Add3D {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size of array");
		int row=sc.nextInt();
		System.out.println("enter the column size of array");
		int col=sc.nextInt();
		
	System.out.println("enter the elements");
	int arr[][][]=new int[row][col][];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;i<arr.length;k++)
				{
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				for(int k=0;k<arr.length;k++)
				{
				System.out.print(arr[i][j][k]+" ");
			}
			System.out.println();

	}

}
	}
}
