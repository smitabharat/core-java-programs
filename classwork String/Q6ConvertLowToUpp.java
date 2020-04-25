package classwork;

import java.util.Scanner;
//6) Write a Java program to convert lowercase string to uppercase.
public class Q6ConvertLowToUpp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String ");
		String str1= sc.next();
		char ch[]=str1.toCharArray();
	//	char c=sc.next().charAt(0);
		for (int i = 0; i < ch.length; i++)
		{
			System.out.print((char)(ch [i]-32));
		}

}
