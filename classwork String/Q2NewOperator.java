package classwork;
//2) Compare string using new operator when.
public class Q2NewOperator {

	public static void main(String[] args) {
		String s1= new String("Praafull");
		char ch1[]=s1.toCharArray();
		String s2= new String("Praafull");
		char ch2[]=s2.toCharArray();
			
		if(ch1.length==ch2.length)
		{
			for (int i = 0; i < ch2.length; i++) 
			{
				if(ch1[i]==ch2[i])
				{
					System.out.println(" Both String Are same ");
				}
				else
					System.out.println("string are different");
			}
		}
		else
		System.out.println("Length are differnt so String not same");
	}

}
