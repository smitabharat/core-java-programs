package classwork;

import java.util.Scanner;
//5) Write a Java program to compare two strings.
public class Q5CompareTwoString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First  String ");
		String str1= sc.next();
		System.out.println("Enter second  String ");
		String str2= sc.next();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
