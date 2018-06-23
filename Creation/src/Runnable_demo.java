import java.util.Scanner;

class Task12 implements Runnable
{
	Task12()
	{
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter un");
		int un=sc.nextInt();
		System.out.println("enter pw");
		int pw=sc.nextInt();
		System.out.println("collect money");
	}
}
class Task13 implements Runnable
{
	Task13()
	{
		Thread t2=new Thread(this);
		t2.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Bangalore University");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Task14 implements Runnable
{
	Task14()
	{
		Thread t3=new Thread(this);
		t3.start();
	}
	public void run()
	{
		int a,b,c;
		a=80;
		b=45;
		c=a+b;
		System.out.println(c);
	}
}
public class Runnable_demo 
{
	public static void main(String[] args)
	{
		Task12 t1=new Task12(); /*it is not a thread type object because not extending Thread class rather implementing runnable interface */
		Task13 t2=new Task13(); //so we can create thread for the object with in a constructor of class or any where in the program as per requirements
		Task14 t3=new Task14();
		
	}

}
