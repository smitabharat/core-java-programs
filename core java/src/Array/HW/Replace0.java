package Array.HW;

public class Replace0 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {26,0,67,45,0,78,54,34,10,0,34};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
				System.out.println("After modification");
				for(int i=0;i<a.length;i++)
				
			System.out.println(a[i]);
		}
		

	}


