class Re_throw
{
	void fun1()
	{
		System.out.println("inside fun1()");
		try
		{
			fun2();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun1()");
			throw e;                         // when ever the control encounters with throw keyword it will leave the () along with exception 
		}                                    //exception object will go to the caller()
	}
	void fun2()
	{
		System.out.println("inside fun2()");
		try
		{
			int a,b,c;
			a=4;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun2()");
			throw e;
		}
	}
}
class Re_throwing
{
	public static void main(String[] args) 
	{
		Re_throw re=new Re_throw();
		try 
		{
			re.fun1();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in main()");
		}
		System.out.println("exiting main() normally");
	}
}
