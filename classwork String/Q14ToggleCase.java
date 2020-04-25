package classwork;
//14) Write a Java program to toggle case of each character of a string.
import java.util.Scanner;
public class Q14ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter String ");
		String st=sc.nextLine();
		
		char ar[]=st.toCharArray();
		//char ch=sc.nextLine();
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>='a'&&ar[i]<='z')
			{
				ar[i]=(char)(ar[i]-32);
			}
			else
				if(ar[i]>='A'&&ar[i]<='Z')
				{
					ar[i]=(char)(ar[i]+32);
				}
			System.out.print(ar[i]);
		}
	}

}
