package classwork;

import java.util.Scanner;
//8) WAP to split string into 2 tokens where string is “HELLO@WORLD”
public class Q8SplitString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String ");
		String str1= sc.next();
		char ch[]=str1.toCharArray();
		int start = 0,end=ch.length-1,mid=start+end/2;
		char ch1[]=new char[mid];
		char ch2[]=new char[ch.length-mid];
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		//split ch array into ch1 and ch2
		int pos=0,pos1=0;
		for (int i = 0; i < mid; i++)
		{
			ch1[pos]=ch[i];
			pos++;
		}
		for (int i = 0; i < mid; i++) {
			System.out.print(ch1[i]);
		}
		System.out.println();
		// split ch array ch2
		for (int i = 0; i < ch2.length; i++) {
			ch2[pos1]=ch[mid+i];
			pos1++;
		}
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}	
		System.out.println();
	}
}
