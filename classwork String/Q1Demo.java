package classwork;
//  1) WAP to create strings using new and using literal.
import java.util.Scanner;

public class Q1Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String first");
		String s=sc.next();
		 String s1 = new String(s);
		 System.out.println(s1+"  ");
		 System.out.println("Enter String second");
			String s2=sc.next();
			String s3= new String(s2);
			System.out.println(s3+"  ");

	}

}
