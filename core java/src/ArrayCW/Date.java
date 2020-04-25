package ArrayCW;

import java.util.Scanner;

public class Date {
	int day,month,year;
	
	Scanner sc=new Scanner(System.in);
	void inputDate()
	{
		System.out.println("enter the day month year");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		
	}
	void DateDisplay()
	{
		System.out.println("day="+day+"month="+month+"year="+year);
	}

}
