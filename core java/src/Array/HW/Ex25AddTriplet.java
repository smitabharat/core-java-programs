package Array.HW;
import java.util.*;

public class Ex25AddTriplet 
{

	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = sc.nextInt();
		System.out.println("Enter the elements");
		int[] a = new int[s];
		for(int i=0;i<s;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the required sum");
		int sum = sc.nextInt();
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
						System.out.println(a[i]+"+"+a[j]+"+"+a[k]+"="+sum);
				}
			}
		}
		
		
	}

}
