package Array.HW;
import java.util.*;
//equal salary
public class Employeeex12 
{
	Scanner sc=new Scanner(System.in);
	int eid;
	String name;
	double salary;
	
	Employeeex12 ()
	{
		System.out.println("Enter id,name salary");
		eid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
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
	public String toString() 
{
		return "Employeeex12 [sc=" + sc + ", eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args)
	{
		Employeeex12[] e=new Employeeex12[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employeeex12 ();
		}
		int min;
		Employeeex12 m=e[0];
		
		for(int i=0;i<e.length;i++)
		{
              min=i;
              for(int j=0;j<e.length;j++)
            	  if(e[i].getSalary()==m.getSalary())
            	  {
            		  m=e[i];
            		  System.out.println(m);
            		  min=j;
				
			}
		}
		}
	}
