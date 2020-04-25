package Array.HW;
import java.util.Scanner;

public class AscendingBubble {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,i,j,temp;
		System.out.println("enter the number size");
		num=sc.nextInt();
		System.out.println("enter the\t"+num+"elements");
		int array[]=new int[num];
		for(i=0;i<num;i++)
			array[i]=sc.nextInt();
		
		for(i=0;i<num-1;i++)
		{
			for(j=0;j<num-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("sorted list of integers");
		
for(i=0;i<num;i++)
	System.out.println(array[i]);
	}

}
