package Array.HW;

import java.util.Scanner;

public class Ex22Subarray
{

	void findFirstSub(int a[],int ar_len,int sub_len)
		{
			int index=0,sum;
			double avg,least=0;
			
			for(int i=0;i<ar_len;i++)
			{	
				sum=0;
				if((i+(sub_len-1))<ar_len)
				{
					for(int j=i;j<(i+sub_len);j++)
					{
					sum = sum+a[j];
					System.out.print(a[j]+" ");
					}
					System.out.println(" = "+sum+"\n");
				
					avg = sum/sub_len;
				System.out.println("Average ="+avg);
				if(least==0)
				{
					least = avg;
					index=i;
				}
				else if(least>avg)
				{
					least = avg;
					index = i;
				}
				}
			}
			System.out.println("Smallest avg is "+least+" with index "+index);
		}
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter size of array");
		  int s = sc.nextInt();
		  System.out.println("Enter the elements"); 
		  int[] a = new int[s]; 
		  for(int i=0;i<s;i++)
			  a[i] = sc.nextInt();
		  System.out.println("enter the array length");
		  int arr_len=sc.nextInt();
		  System.out.println("enter the sub array length");
		  int sub_arr=sc.nextInt();
		 
		//int a[]={3,7,90,20,5,50,40};
		
		Ex22Subarray q = new Ex22Subarray();
		q.findFirstSub(a, arr_len, sub_arr);
		}

}
