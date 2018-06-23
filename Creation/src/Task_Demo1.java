import java.util.*;
class Task11 extends Thread
{
	Task11(String name)   //using constructor of the child class i.e, Task11 & pass the name to the thread class by using super keyword
	{
		super(name);
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter un");
		String un=sc.next();
		System.out.println("enter pw");
		int pw=sc.nextInt();
		System.out.println("collect your money");
	}
}
class Task22 extends Thread
{
	Task22(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			System.out.println("VINAY");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Task33 extends Thread
{  
	Task33(String name)
	{
		super(name);
	}
	public void run()
	{
	int a,b,c;
	a=200;
	b=500;
	c=a+b;
	System.out.println(c);
	}
}
public class Task_Demo1 
{
	public static void main(String[] args) 
	{
		Task11 t1=new Task11("Banking");  
		Task22 t2=new Task22("Printing");
		Task33 t3=new Task33("Addition");
		t1.start();                      //activating all thread classes
		t2.start();
		t3.start();
	}

}
