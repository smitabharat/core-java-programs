package Array.HW;
import java.util.*;

public class Average 
{

	public static void main(String[] args) 
	{
		int sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter\t"+size+"\telements");
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			 
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
			avg= sum/size;
		}
		System.out.println("sum="+sum);
		System.out.println("Average="+avg);
		

	}

}
