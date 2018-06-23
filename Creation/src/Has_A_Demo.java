class Os
{
	Os()
	{
		System.out.println("os is executing");
	}
	void get_os()
	{
		System.out.println("os is still executing");
	}
}
class Charger
{
	String name;
	Charger(String name)
	{
		this.name=name;
		System.out.println("charger is executed");
	}
	void get_charger()
	{
		System.out.println("charger is still executing");
		System.out.println("name of the charger is:"+name);
	}
}
class Mobile
{
	Os o=new Os();
	Mobile()
	{
		System.out.println("mobile is created with os installed");
	}
	void has_A(Charger c)
	{
		System.out.println("mobile is connected to charger");
	}
}
class Has_A_Demo
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		Charger c=new Charger("samsung");
		m.o.get_os();
		c.get_charger();
		m.has_A(c);
		m=null;
		
	}
}


