
public class Ex10ThrowsDemo 
{

	public static void main(String[] args) 
	{
		double result=0;
		try
		{
			System.out.println("Arithmetic exception is thrown");
		result=Ex8Demo.division(10, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("result is"+result);
		}

	}

}
