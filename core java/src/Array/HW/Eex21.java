package Array.HW;

import java.util.Scanner;

public class Eex21 {
	int eid;
	String name;
	double salary;
	
	Eex21()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,salary");
		eid=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
		}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "EmployeeSalary [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) 
	{
		EmployeeSalary e[]=new EmployeeSalary[3];
		
		for(int i=0;i<e.length;i++)
		{
			e[i]=new EmployeeSalary();
			
		}
		System.out.println(e);//return hashcode
		EmployeeSalary max=e[0];
		for(int i=1;i<e.length;i++)
		{
			if(e[i].getSalary()>max.getSalary())
			{
				max=e[i];
			}
		}
		System.out.println("largest salary"+max);

	}

}
