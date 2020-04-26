import java.util.*;
public class Ex15UserRegistration 
{
	

	void registerProfile(String Username,int age,String Country) throws InvalidAgeException, InvalidCountryException
	{
	if(!(Country.equals("India")))
		{
			throw new InvalidCountryException("error");
		}
		else
		{
			System.out.println("Welcome U r Valid");
		}
		if(age<18)
		{
			throw new InvalidAgeException("User is a Minor");
		}
		else
		{
			System.out.println("Welcome");
		}
		System.out.println("hello");
		
	}
	public static void main(String[] args) throws InvalidAgeException, InvalidCountryException 
	{
		 Ex15UserRegistration e=new Ex15UserRegistration();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Name , Age , country");

		 String name = sc.next();
		 int age = sc.nextInt();
		 String  country = sc.next();

		e.registerProfile(name, age ,country);
		
		InvalidAgeException I=new InvalidAgeException("Age");
		InvalidCountryException c=new InvalidCountryException("India");
		
		
		


	}

}
