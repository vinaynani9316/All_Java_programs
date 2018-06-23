import java.util.Scanner;
public class Throwing_exception_manually 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("inside main()");
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
				System.out.println("difference is:"+c);
			}
			else
			{
			   Exception e=new Exception();      //create Exception class constructor for not known problems to JVM & bind it address of the object using throw keyword
			   throw e;                          //OR you can write like this also "throw new Exception();"
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught i.e a<b");
		}
		System.out.println("exiting main() normally");
		sc.close();
	}
}
