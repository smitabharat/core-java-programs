package Array.HW;
import java.util.*;

public class Student 
{
	int rollno,marks;
	String name;
	
	Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,salary");
		rollno=sc.nextInt();
		name=sc.next();
		marks=sc.nextInt();
	}
	
	public int getRollno() {
		return rollno;
	}

public void setRollno(int rollno) {
		this.rollno = rollno;
	}

public int getMarks() {
		return marks;
	}

public void setMarks(int marks) {
		this.marks = marks;
	}

public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
}

	public static void main(String[] args) 
	{
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
		}
		System.out.println(s);
		Student max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(s[i].getMarks()>max.getMarks())
			{
				max=s[i];
			}
		}
		System.out.println("largest marks"+max);

	}

}
