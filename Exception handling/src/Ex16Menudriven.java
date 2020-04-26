import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Ex16Menudriven 
{
	static int a;
	static void m1()throws ArithmeticException
	{
		System.out.println("m1()");
		int a=10/0;
	}
	
	public static void main(String[] args)throws ArithmeticException, FileNotFoundException 
	{
		int c = 0;
	
		Scanner sc=new Scanner(System.in);
		
		
		Ex16Menudriven m=new Ex16Menudriven();
		do
		{
			System.out.println("Enter the choice 1:try catch demo \n 2:try multi catch demo \n3:try finally demo\n4:try catch finally demo \n5:throw demo\n 6:throws demo");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("try catch");
		
		try
		{
		int a=10/0;
	    }
		catch(Exception e)
		{
			System.out.println("exception="+e);
		}
			break;
			
			
		case 2: System.out.println("try multi catch");
		
		try
		{
			int b=20/0;
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("exception is"+e);
		}
			break;
			
		case 3: System.out.println("finally");
		try
		{
		FileReader fr=new FileReader("D:/hefshine program");
		int a=10/10;
		}
		
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("hello");
			break;
			
			
		case 4: System.out.println("try catch finally");
		try
		{
		FileReader fr=new FileReader("D:/hefshine program");
		int a=10/10;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("hello");
		break;
		
		case 5: System.out.println("throw");
		double  result1=0,a=10,b=20;
		 try
		 {
	     result1=a/b;
		throw new ArithmeticException();
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 break;
			
		case 6: System.out.println("throws");
		m1();
		break;
		default:System.out.println("invalid input");
		
		
		 
		
		}
		System.out.println("do u want to continue 'y/n' if no then press 7");
		c=sc.nextInt();
		
	}
		while(c!=7);
		 
	
	}
}

	