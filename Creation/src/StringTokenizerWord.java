import java.util.*;
public class StringTokenizerWord 
{
 public static void main(String[] args) 
		{
	      String s1;
	      Scanner scan=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      s1=scan.nextLine();
	      int i;
	      StringTokenizer stk=new StringTokenizer(s1," ");
	      while(stk.hasMoreTokens()==true)
	      {
	    	  String token=stk.nextToken();
	    	  char words[]=token.toCharArray();
	    	  int m=token.length();
	    	  for(i=m-1;i>=0;i--)
	    	  {
	    		  System.out.print(words[i]);
	    	  }
	    	  System.out.print(" ");
	      }
	      scan.close();
		}
}
	      



