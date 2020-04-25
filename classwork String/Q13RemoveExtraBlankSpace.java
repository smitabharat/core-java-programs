package classwork;

//13) Wap to remove all extra blank spaces from a given string.
public class Q13RemoveExtraBlankSpace {

	public static void main(String[] args) {
		
//		Scanner sc  =new Scanner(System.in);
//		System.out.println("Enter String ");
//		String st=sc.nextLine();
		String st= "          Praful    Shelke   07  ";
		char []ch=st.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(((ch[i]==' ') && (ch[j]==' ' )))
				{
					ch[j]='@';
				}
				else
				{
					break;
				}
			}
			if(ch[i]!='@')

			System.out.print(ch[i]);
		}
	}
}
