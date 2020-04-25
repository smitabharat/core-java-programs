package ArrayCW;

import java.util.Scanner;

public class Dept {
	Scanner sc=new Scanner(System.in);
	int did;
	String dname;
	Employee e=new Employee();
	void input()
	{
		System.out.println("enter dept id and name");
		did=sc.nextInt();
		dname=sc.next();
		e.inputEmp();
	}
	void display()
	{
		System.out.println("id="+did+"name="+dname);
		e.Edisplay();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employees");
		int no=sc.nextInt();
		Dept d[]=new Dept[no];
		for(int i=0;i<d.length;i++)
		{
			d[i]=new Dept();
			d[i].input();
		}
		for(int i=0;i<d.length;i++)
		{
			d[i].display();
		}
		

	}

}
