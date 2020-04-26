import java.io.FileReader;
import java.io.IOException;

public class Ex13trycatchfinally
{
	static FileReader fr;

	public static void main(String[] args)throws IOException
	{
		try
		{
			fr=new FileReader("D://hefshine program");
			int a=10/10;
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		finally
		{
			System.out.println("finally block");
			try
			{
				fr.close();
			}
			catch(Exception e)
			{
				
			}
			System.out.println("hello");
		}

	}

}
