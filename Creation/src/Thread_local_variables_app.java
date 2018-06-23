class Thread_local extends Thread
{
	int count;  //if we use volatile or static keyword the copy of instance variables will not create respective to heap for volatile 
	public void run()//static space for static keyword but this is time  consuming because it has to fetch details from heap or static space
	{
		if(Thread.currentThread().getName().equals("print"))
		{
			print();
		}
		else
		{
			add();
		}
	}
	void print()
	{
		int a,b,c;
		a=10; b=20; c=30;
		for(int i=1;i<=10;i++)
		{
			count=count+a+b+c;
		}
		System.out.println(count);
	}
	void add()
	{
		int x,y,z;
		x=1000; y=2000; z=3000;
		for(int i=1;i<10;i++)
		{
			count=count+x+y+z;
			count=count+x+y+++z++;
		}
		System.out.println(count);
	}
}
public class Thread_local_variables_app 
{
	public static void main(String[] args) 
	{
		Thread_local t1=new Thread_local();
		Thread_local t2=new Thread_local();
		t1.setName("print");
		t2.setName("add");
		try
		{
			t1.start();
			t1.join();
			t2.start();
		}
		catch(Exception r)
		{
			System.out.println(r.getMessage());
		}
	}
}
