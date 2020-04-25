package Array.HW;
//highest salary to loewst salary
import java.util.Scanner;

public class EmployeeSalary 
{
	int eid;
	String name;
	double salary;
	
	EmployeeSalary()
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
		int j ,i;
		EmployeeSalary temp;
		EmployeeSalary[] e=new EmployeeSalary[3];
		
		for( i=0;i<e.length;i++)
		{
			e[i]=new EmployeeSalary();
			
		}
//		System.out.println(e);//return hashcode
//		EmployeeSalary max=e[0];
		for( i=0;i<e.length;i++)
			{
				int min=i;
				for( j=i+1;j<e.length;j++)
				{
					
					if(e[j].getSalary()>e[min].getSalary())
					{
						min=j;
					}
				}
				temp=e[i];
				e[i]=e[min];
				e[min]=temp;
			}
			for(i=0;i<e.length;i++)
			System.out.println(e[i]);
			}

}
