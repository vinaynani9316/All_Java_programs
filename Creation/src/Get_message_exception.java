import java.util.Scanner;
@SuppressWarnings("serial")
class ALessThanBException extends Exception            
{
	public String get_message()                  // to know what the problem is in customized exception
	{
		return "error in sub...a<b";
	}
}
public class Get_message_exception 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a,b,c;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		try
		{
			if(a>b)
			{
				c=a-b;
				System.out.println(c);
			}
			else
			{
				throw new ALessThanBException();
			}
		}
		catch(ALessThanBException e)                            //standard form
		{
			System.out.println(e.get_message());               //over riding e.get_message()
		}
		sc.close();
	
	}
	

}
