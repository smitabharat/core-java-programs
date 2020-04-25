package Array.HW;

import java.lang.reflect.Array;


public class reverseusingtemp 
{

	public static void main(String[] args)
	{
		int[]a=new int[] {1,6,8,9,5};
		int n=a.length;
		int[]b=new int[n];
		for(int i=0; i<n;i++)
		{
        int temp=a[i];
        b[i]=a[n-i-1];
        a[i]=temp;
        System.out.println(b[i]);
		}
		
		

	}

}
