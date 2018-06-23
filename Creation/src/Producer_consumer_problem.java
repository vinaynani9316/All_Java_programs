class Factory
{
	int item;
	synchronized void producer_machine()
	{
		try
		{
			item++;
			System.out.println("Item" +item+ "is under production");
			Thread.sleep(2000);
			System.out.println("Item"+item+ "is produced");
			notify();
			wait();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	synchronized void consumer_machine()
	{
		try
		{
			System.out.println("Item" +item+ "is under consumption");
			Thread.sleep(2000);
			System.out.println("Item" +item+ "is consumed");
			notify();
			if(item<5)
			{
				wait();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Producer extends Thread
{
	Factory f;
	Producer(Factory x)
	{
		f=x;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			f.producer_machine();
		}
	}
}
class Consumer extends Thread
{
	Factory f;
	Consumer(Factory x)
	{
		f=x;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			f.consumer_machine();
		}
	}
}
class Producer_consumer_problem
{
	public static void main(String[] args) 
	{
		Factory f=new Factory();
		Producer p=new Producer(f);
		Consumer c=new Consumer(f);
		p.start();
		c.start();
	}
}