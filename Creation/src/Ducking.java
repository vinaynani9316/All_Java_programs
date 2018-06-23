class Duck
{
	void fun1()                                 //called()
	{
		System.out.println("inside_fun1()");
		fun2();
	}
	void fun2()
	{
		System.out.println("inside_fun2");  //the process of throwing the exception object automatically to the caller() by the called()
		int a,b,c;                          //with out handling it is known as ducking
		a=80;
		b=0;
		c=a/b;
		System.out.println(c);
	}
}
public class Ducking 
{
	public static void main(String[] args)          //caller()
	{
		System.out.println("inside main()");
		Duck d=new Duck();
		try
		{
			d.fun1();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in main()");
		}
		System.out.println("exiting main()normally");
	}

}
