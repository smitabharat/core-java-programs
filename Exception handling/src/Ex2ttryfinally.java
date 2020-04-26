import java.io.FileReader;
import java.io.IOException;

public class Ex2ttryfinally
{

	
		static FileReader fr;
	
	public static void main(String[] args) throws IOException
	{
		try
		{
		 fr=new FileReader("D:/hefshine program");
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

	}

}

