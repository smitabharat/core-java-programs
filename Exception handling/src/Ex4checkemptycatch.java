import java.lang.*;
public class Ex4checkemptycatch 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3};
		System.out.println("hello");
		try
		{
			int a=10/arr[0];
		}
		catch(Exception e)
		{
			//it is allow to blank catch block it can handle exception.
			
		}
  System.out.println("welcome");
	}

}
