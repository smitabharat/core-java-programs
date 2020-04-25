package classwork;

import java.util.Scanner;
//   7) Write a Java program to copy one string to another string.
public class Q7Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First  String ");
		String str1= sc.next();
		char ch[]=str1.toCharArray();
		System.out.println("Given String");
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch[i]);
		}
		
		char ch2 []= new char [ch.length];
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = 0; j < ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch2[i]=ch[i];
				}
			}
		}
		System.out.println();
		System.out.println("Copy String");
		for (int i = 0; i < ch.length; i++)
		{
				System.out.print(ch2[i]);
		}
		

	}

}
