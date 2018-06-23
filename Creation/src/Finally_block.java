class Block
{
	void fun1()                                          //called function
	{
		System.out.println("fun1() connecting to db");
		System.out.println("fun1()connected to db");
		try
			{
				fun2();
			}
			catch(Exception e)
			{
				System.out.println("exception caught in fun1()");
				throw e;
			}
		finally
		{
			System.out.println("fun1()disconnected from db");
		}
	}
	void fun2()
	{
		System.out.println("fun2()connecting to db ");
		System.out.println("fun2()connected to db");
		try
		{
			int a,b,c;
			a=80;
			b=0;
			c=a/b;                         //exception occurs 
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun2()");
			throw e;                                          // finally block executed even control encounters with throw keyword
		}                                               // finally block is executed irrespective of whether an exceptions occur or not
		finally
		{
			System.out.println("fun2() disconnected from db2");
		}
	}
}
public class Finally_block 
{
	public static void main(String[] args)        //caller function
	{ 
		System.out.println("main() connecting to db");
		System.out.println("main() connected to db");
		Block b=new Block();
		try
		{
			b.fun1();
		}
		catch(Exception e)
		{
			System.out.println("execption caught in main()");
		}
		finally
		{
			System.out.println("main() disconnected from db");
		}
	}

}
