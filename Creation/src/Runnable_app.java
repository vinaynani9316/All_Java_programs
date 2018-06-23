import java.util.Scanner;

class Test11 implements Runnable
{
	Test11()
	{
		
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
class Test12 implements Runnable
{
	Test12()
	{
		
	}
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
			System.out.println("Admin");
			Thread.sleep(2000);
		    }
		}
		catch(Exception f)
		{
			System.out.println(f.getMessage());
		}
	}
}
class Test13 implements Runnable
{
	Test13()
	{
		
	}
	public void run()
	{
		int a,b,c;
		a=300;
		b=-500;
		c=a+b;
		System.out.println(c);
	}
}
public class Runnable_app 
{
	public static void main(String[] args) 
	{
		Test11 t1=new Test11();                
	    Thread x=new Thread(t1);   //thread object in main()
		Test12 t2=new Test12();
		Thread y=new Thread(t2);
		Test13 t3=new Test13();
		Thread z =new Thread(t3);
		x.start();
		y.start();
		z.start();
	}

}
