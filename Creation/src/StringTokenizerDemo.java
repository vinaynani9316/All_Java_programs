import java.util.*;
class StringTokenizerDemo 
{
public static void main(String[] args) 
	{
		String s1="Raja,Ram,Mohan,Roy";
		StringTokenizer stk=new StringTokenizer(s1,",");
		while(stk.hasMoreTokens()==true)
		{
			String token=stk.nextToken();
			System.out.println(token);
      	}
	}		

}


