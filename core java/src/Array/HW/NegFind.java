package Array.HW;
import java.util.*;

public class NegFind 
{

	public static void main(String[] args)
	{
		int i,icnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int ele[]=new int[size];
		System.out.println("enter the"+size+" elements of array");
		for(i=0;i<size;i++)
		ele[i]=sc.nextInt();
		
		for( i=0;i<size;i++)
		{
			if(ele[i]<0)
			{
				System.out.println(ele[i]+"negative numbers");
			icnt++;
			System.out.println("negative numbers"+icnt);
			}
		
				
		}
		

	}

}
