package classwork;

/*     15) Write a program which creates a String Buffer 
 “This is String Buffer” and performs the following.
i. Adds the string ”- This is a sample program” to existing string and display it.
ii. Inserts the string “Object” into the existing string at 21st postion and display it.
iii. Reverses the entire string and displays it.
iv. Replaces the word “Buffer” with “Builder” and display it.   */
public class Q15StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new  StringBuffer("This is String Buffer  ");
		System.out.println(sb);
	
		StringBuffer s1=sb.append("This is a sample program");
		System.out.println(s1);
				System.out.println(s1.insert(21, "  Object"));
				System.out.println(s1.reverse());				
	}
}
