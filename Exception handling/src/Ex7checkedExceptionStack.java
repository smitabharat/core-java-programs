
public class Ex7checkedExceptionStack 
{

	static void m1()
	{
		System.out.println("in m1 starts");
		m2();
		System.out.println("in m1 ends");
	}
	static void m2()
	{
		System.out.println("m2 starts");
		try
		{
		int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e); 
		}
		System.out.println("m2 ends");
	}
	public static void main(String[] args)
	{
		System.out.println("in main method starts");
		m1();
		System.out.println("main ends");

	}

}
