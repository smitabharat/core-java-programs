
public class Ex3Catchuse 
{

	public static void main(String[] args)
	{
		System.out.println("hello");
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is /t"+e);
		}
		System.out.println("welcome");

	}

}
