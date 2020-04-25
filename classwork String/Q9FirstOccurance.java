package classwork;

import java.util.Scanner;
//9) Write a Java program to find first occurrence of a character in a given string.
public class Q9FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str1=sc.nextLine();
		char ar [] = str1.toCharArray();
		
		System.out.println("Enter character that is find occurance");
		char ch = sc.next().charAt(0);
		int cnt=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ch)
			{
				cnt++;
				// break;
			}
			
		}
		System.out.println(ch +"    first occurance is at time   "+cnt);
		
		
	}

}
