
public class Ex5ArrayException {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3};
		System.out.println("hello");
		try
		{
			int a=10/arr[3];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("exception"+e);
			
		}
  System.out.println("welcome");

	}

}
