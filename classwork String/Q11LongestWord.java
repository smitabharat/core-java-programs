package classwork;

import java.util.Scanner;
//11) WAP to find longest word in the given sentence
public class Q11LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String ");
		String str1=sc.nextLine();
		String[] s2=new String[str1.length()];
				s2=str1.split(" ");
		String max=s2[0];
		for (int i = 0; i < s2.length; i++)
		{
			if(s2[i]!=" ")
			{
				if(max.length()<s2[i].length())
				{
					max=s2[i];
							System.out.println(max);
				}
			}
		}
		System.out.println("Maximum String is :"+max+" \n maximum length is : "+max.length());
		
//		int min=s2[0];
//		int cnt=0;
//		for (int i = 0; i < s2.length; i++) {
//		if(s2[o]>s2.length)
//		{
//			min=s2[i];
//			cnt++;
//		}
//		}
	}

}
