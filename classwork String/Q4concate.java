package classwork;

import java.util.Scanner;

//4) Write a Java program to concatenate two strings.
public class Q4concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First  String ");
		String str1= sc.next();
		System.out.println("Enter second  String ");
		String str2= sc.next();
		System.out.println("concatenate two strings ");
		String str3 =str1+str2;
		System.out.println(" "+str3);
		
	}

}
