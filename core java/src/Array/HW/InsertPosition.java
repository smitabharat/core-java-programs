package Array.HW;
import java.util.*;

public class InsertPosition
{
	public static void main(String[] args) 
	{
		int ch=0;
		Scanner sc=new Scanner(System.in);
		int size,pos,i;
		
	System.out.println("enter the size of array");
		size=sc.nextInt();
		do
		{
			
		int a[]=new int[size];
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter position");
			pos=sc.nextInt();
			System.out.println("enter element");
			a[pos]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("do u want to continue(y/n)");
		ch=sc.next().charAt(0);
		}
		while(ch=='y');

}
}
