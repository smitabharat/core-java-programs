package classwork;
/*
 16) Exchange Cipher (String & char)This simple cipher exchanges 
 'A' and 'Z', 'B' and 'Y', 'C' and 'X', and so on. Write a program
  called Exchange Cipher that prompts user for a plaintext string 
  consisting of mix-case letters only. Your program shall
 compute the cipher text; and print the cipher text in uppercase.
 For examples, Enter a plaintext string: abcXYZ 
 The cipher text string is: ZYXCBA (March Monthly)
 */
public class Q16Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="abcXYZ";
			char ch[]=str.toCharArray();
			
		/*	for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					System.out.print("  "+(char)(ch[i]-32));
				}
				else  
					System.out.print("  "+ch[i]);
			}*/
			//System.out.println((char)(90));
			
			System.out.println("Original String is : "+str);
			for(int i=0;i<ch.length;i++)
			{
				//System.out.println(ch[i]);
				if(( 90>=ch[i])  )
				{
					System.out.println("ch : "+ch[i]+" : "+(char)(155-ch[i]));
				}
				else
					if((97<=ch[i]))
					{
						System.out.println("ch : "+ch[i]+" : "+(char)(187-ch[i]));
					}
			}
		
	}

}
