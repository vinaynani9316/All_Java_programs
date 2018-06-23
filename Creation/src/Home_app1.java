class Home1 implements Runnable
{
	Home1()
	{
		Thread t1=new Thread(this);
		Thread t2=new Thread(this);
		Thread t3=new Thread(this);
		t1.setName("boy ");
		t2.setName("girl ");
		t3.setName("others ");
		try
		{
			t1.start();
			t1.join();   // by using join join keyword we expect sequence of execution in Thread one after other 
			t2.start();
			t2.join();
			t3.start();
		}
		catch(Exception n)
		{
			System.out.println(n.getMessage());
		}
	}
	  public void run()
	{
	  try
	     {
		    System.out.println(Thread.currentThread().getName()+"has entered the bathroom");
		    Thread.sleep(2000);
		    System.out.println(Thread.currentThread().getName()+"has closed the door");
		    Thread.sleep(2000);
		    System.out.println(Thread.currentThread().getName()+"is taking bath");
		    Thread.sleep(2000);
		    System.out.println(Thread.currentThread().getName()+"is dressing up");
		    Thread.sleep(2000);
	     }
	  catch(Exception e)
	  {
		  System.out.println(e.getLocalizedMessage());
	  }
	}
}
public class Home_app1 
{
	public static void main(String[] args) 
	{
		Home1 h=new Home1();
	}

}
