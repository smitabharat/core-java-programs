package Array.HW;
import java.util.*;

public class Merge 
{

	public static void main(String[] args) 
	{
		int i,j,k;
//		int arr1,arr2,num1,num2;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter 1st and 2nd array size");
//		arr1=sc.nextInt();
//		arr2=sc.nextInt();
//		
//		System.out.println("enter the elements of "+arr1+"array1");
//		num1=sc.nextInt();
//		
//		System.out.println("enter the elements of "+arr2+"array2");
//		num2=sc.nextInt();
//		
//		int marr[]=new int[arr1+arr2];
//		
//		
//		for(int i=0;i<arr1;i++)
//		{
//			marr[i]=arr1[num1];
//		}
//		
		
		int arr[]=new int[] {2,4,3,5,6};
		int arr1[]=new int[] {3,5,6,7,8};
		
		int arr2[]=new int[arr.length+arr1.length];
		
		for( i=0;i<arr.length;i++)
			arr2[i]=arr[i];
		
		for( j=0;j<arr1.length;j++)
			arr2[arr.length+j]=arr1[j];
		
		
		
		for(k=0;k<arr2.length;k++)
			
			System.out.println(arr2[k]);
	}

}
