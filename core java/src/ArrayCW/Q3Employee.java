package ArrayCW;

import java.util.Scanner;

public class Q3Employee {
	int emp_id;
	String emp_name;
	double salary;
	Q3Dept d1=new Q3Dept();
	 static Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter employee name");
		emp_name=sc.next();
		System.out.println("Enter employee  id");
		emp_id=sc.nextInt();
		System.out.println("Enter employee salary");
		salary = sc.nextDouble();
		d1.inputDept();
	}
			void display()
			{
				System.out.println(" employee name  "+emp_name);
				System.out.println(" employee id  "+emp_id);
				System.out.println(" employee salary  "+salary);
				d1.displayDept();
			}
	
	public static void main(String[] args)
	{
		System.out.println("enter the no of employees");
		int no=sc.nextInt();
		Q3Employee q[]=new Q3Employee[no];
		for(int i=0;i<q.length;i++)
		{
			q[i]=new Q3Employee();
			q[i].input();
		}
		
		for(int i=0;i<q.length;i++)
		{
			q[i].display();
		}
		
		}
}
