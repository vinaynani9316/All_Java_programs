import java.util.*;
public class Demo9 
{
	public static void main(String[] args) throws Exception
	{
		String s1;
		char ch;
		int count;
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		s1=scan.next();
		System.out.println("enter the character to be searched in the string");
		ch=(char)System.in.read();
		count=0;
		for(i=0;i<=s1.length()-1;i++)
		if(s1.charAt(1)==ch)
		{
			count++;
		}
	
	
System.out.println("count" +count);
scan.close();
    }

}

