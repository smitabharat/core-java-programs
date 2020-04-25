package Array.HW;

public class Merge2into3rd 
{
	void interleaved(char[]s1,char[]s2,char[]s3,int x1,int x2)
	{
		int pos=0;
		for(int i=0;i<s3.length;i++)
		{
			if(pos<s3.length)
			{
			s3[pos]=s1[i];
			pos++;
			s3[pos++]=s2[i];
		     }
	    }
	for(int i=0;i<s3.length;i++)
	{
		System.out.print(s3[i]+"");
	}
}
public static void main(String[] args) 
	{ 
		int x1,x2;
		char s1[]= {'a','b','c','d'};
		char s2[]= {'w','x','y','z'};
		x1=s1.length;
		x2=s2.length;
		char s3[]=new char[s1.length+s2.length];
		
		Merge2into3rd m=new Merge2into3rd();
		m.interleaved(s1, s2, s3, x1, x2);
	}

}
