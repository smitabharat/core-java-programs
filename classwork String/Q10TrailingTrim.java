package classwork;

import java.util.Scanner;

//10) Write a Java program to trim trailing white space characters in a string
public class Q10TrailingTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str1=sc.nextLine();
		char ar [] = str1.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]!=' ')
			{
				System.out.print(ar[i]);
			}
		}
		  

	}

}
