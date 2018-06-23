public class Final_error 
{
	public static void main(String[] args) 
	{
		System.out.println("inside main()");
		try
		{
			System.out.println("inside try block");
			int a[]=new int[999999999]; //out of memory in main() allocate such a memory in heap
		}
		catch(Exception e)
		{
			System.err.println("exception caught");
		}
		finally
		{
			System.out.println("finally block executed"); //even though error occurs finally block will execute.
		}
		System.out.println("exiting main");
	}

}
