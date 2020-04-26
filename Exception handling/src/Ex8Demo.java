
public class Ex8Demo 
{
	
	static double division(int a,int b)
	{
		int result=0;
		 try
		 {
		 result=a/b;
		//throw new ArithmeticException();
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
			 System.out.println("divisor cannot be zero");
		 }
		 return result;
	}

	public static void main(String[] args) 
	{
		System.out.println(division(10,5));
		

	}

}
