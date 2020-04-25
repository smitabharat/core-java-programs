package ArrayCW;

import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	int emp_id;
	String emp_name;
	double emp_salary;
	Date d=new Date();
	void inputEmp()
	{
		System.out.println("enter the id,name,salary");
		 emp_id=sc.nextInt();
		 emp_name=sc.next();
		 emp_salary=sc.nextDouble();
		 d.inputDate();
	}
	 void Edisplay()
	 {
		 System.out.println("emp_id="+emp_id+"emp_name"+emp_name+"emp_salary"+emp_salary);
		 d.DateDisplay();
	 }
	

}
