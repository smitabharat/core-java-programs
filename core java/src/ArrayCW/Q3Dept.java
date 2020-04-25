package ArrayCW;

import java.util.Scanner;

public class Q3Dept {

	int d_id;
	String d_name;
	Q3MyDate m=new Q3MyDate();
	void inputDept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department id  ");
		d_id=sc.nextInt();
		System.out.println("Enter Department name  ");
		d_name=sc.next();
		m.inputMyDate();
		
	}
		public void displayDept()
		{
			
			System.out.println("Department id  "+d_id);
			System.out.println("Department name  "+d_name);
			m.displayMyDate();

		}

}
