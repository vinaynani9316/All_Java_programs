import java.util.*;
public class StringWords 
{
	public static void main(String[] args) 
	{
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentence");
		s1=scan.nextLine();
		int count=0;
		StringTokenizer stk=new StringTokenizer(s1," ");
		while(stk.hasMoreTokens()==true)
		{
			stk.nextToken();
			count++;
		}
		System.out.println(count);
		scan.close();
	}
}