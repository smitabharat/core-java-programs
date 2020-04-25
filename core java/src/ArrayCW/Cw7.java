package ArrayCW;

import java.util.Scanner;

public class Cw7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter Element");
		int a [] =new int [n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
					a[j]='@';
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i] != '@' && a[j] != '@' )
				{
					System.out.println("{"+a[i]+" , "+a[j]+"}");
				}
			}
		}	
	}
}
