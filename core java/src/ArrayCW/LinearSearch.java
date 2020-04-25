package ArrayCW;
import java.util.*;

public class LinearSearch 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		boolean flag=false;
		char ch;
		
		
		System.out.println("enter \t"+size+"\telements");
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
	}
		do
		{
	System.out.println("enter no to be searched");
	int key=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			System.out.println(key+"\t is found at"+i);
			flag=true;
			break;
		}
	}
	
	if(flag==false)	
	{
		System.out.println(key+"\tnot found");
	}
	System.out.println("do u want to continue?(y/n)");
	ch=sc.next().charAt(0);
		}while(ch=='y');
		

	}

}
