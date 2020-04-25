package ArrayCW;
import java.util.*;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements");
		int size=sc.nextInt();
		
		char ch;
		
		System.out.println("enter"+size+"elements");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		do
		{
			System.out.println("enter no to be searched");
			int no=sc.nextInt();
			int l=0,mid,flag=0,r=a.length-1,cnt=0;
			while(l<=r)
			{
				mid=(l+r)/2;
				if(no==a[mid])
				{
					 cnt ++;
					System.out.println(no+"is found at"+mid+"comparisions="+cnt);
					flag=1;
					break;
				}
				else
				{
					cnt ++;
					if(no>a[mid])
						l=mid+1;
					else
						r=mid-1;
				}
			}
			if(flag==0)
			{
				System.out.println(no+"\tis not found"+"comparisions="+cnt);
			}
			System.out.println("do u want to continue(y/n)");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y');

	}

}
