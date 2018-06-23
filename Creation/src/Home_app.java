class Home implements Runnable
{
	Home()
	{
		Thread t1=new Thread(this);   //this refers o pointing to same object
		Thread t2=new Thread(this);
		Thread t3=new Thread(this);
		t1.setName("boy ");
		t2.setName("girl ");
		t3.setName("others ");
		t1.start();
		t2.start();
		t3.start();                //synchronized keyword happens in same process one Thread after other & in simultaneously  
	}
	synchronized public void run()//in case multiple threads are active, only one thread is allowed to access the resource is called semaphore,
	{                              //or monitor or critical section.
		try
		{
			System.out.println(Thread.currentThread().getName() + "has entered the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "has closed the door");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "is taking bath");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "is dressing up");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());   
		}
	}
	
}
public class Home_app 
{
	public static void main(String[] args) 
	{
		Home h=new Home();
	
	}

}
