package ArrayCW;

import java.util.Scanner;

public class Q3MyDate 
{
	int  day, month, year;
	void inputMyDate()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter day , Month, year");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();	
	}
	
		public void displayMyDate()
		{
			System.out.println("date of joining    "+day+" / "+month+" / "+year);
		}		
}
