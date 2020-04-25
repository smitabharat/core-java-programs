package classwork;

import java.util.Scanner;

//3) Write a Java program to find length of a string.
public class Q3StringLength {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String ");
		String str1= sc.next();
		char ch []=str1.toCharArray();
		System.out.println("Length of a String  = "+ch.length);
		

	}

}
