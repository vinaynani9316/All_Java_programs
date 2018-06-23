import java.util.Scanner;

class Task1 extends Thread
{
	Task1()
	{
		start();
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter un");
		int un=sc.nextInt();
		System.out.println("enter pw");
		int pw=sc.nextInt();
	    System.out.println("collect your money");
	}
}
class Task2 extends Thread
{
	Task2()
	{
		start();                //using of start() will leads to active thread state   
	}
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			System.out.println("ABC");
			Thread.sleep(20000);
		}
		catch(Exception r)
		{
			System.out.println(r.getMessage());
		}
	}
}
class Task3 extends Thread            //shifting the process from one thread to another in same process is known as multithreading
{
	Task3()
	{
		start();                      
	}
	public void run()     //run() will not leads to compile time error & multi threaded program will be converted to single threaded program
	{                          // on the same activation recorder will block in main()
		int a,b,c;
		a=3000;
		b=5000;
		c=a+b;
		System.out.println(c);
	}
}
public class Task_demo 
{
	public static void main(String[] args) 
	{
		Task1 t1=new Task1();    
		Task2 t2=new Task2();
		Task3 t3=new Task3();
	//	t1.getStackTrace(); // to know where the problem is we use getStackTrace()
		
		
		
	}

}
