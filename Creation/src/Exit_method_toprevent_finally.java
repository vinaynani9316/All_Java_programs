public class Exit_method_toprevent_finally 
{
	public static void main(String[] args) 
	{
		System.out.println("inside main()");
		System.exit(0);                           //the only way to prevent execution finally block use exit() before try block then it wont enters to 
		 try                                         //finally block
		{
			System.out.println("inside try block");
			int a,b,c;
			a=20;b=0;c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		System.out.println("exiting main() properly");
	}

}
//exit() is a static method