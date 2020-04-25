package Array.HW;
import java.util.*;

public class Largestele2D {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter 10 integers");
		int array[][]=new int[2][5];
		
		for(int i=0;i<array.length;i++)
		{
			int max=array[i][0];
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=sc.nextInt();
				if(max<array[i][j])
				{
					max=array[i][j];
				}
			}
			System.out.println("maximum number in the row is"+max);
			System.out.println();
		}

	}

}
