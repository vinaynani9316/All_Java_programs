class brain
{
	brain()
	{
		System.out.println("brain is created & sending signals");
	}
	void get_brain()
	{
		System.out.println("brain is still working");
	}
}
class heart
{
	heart()
	{
		System.out.println("heart is created & pumping blood");
	}
	void get_heart()
	{
		System.out.println("heart is still working");
	}
}
class property                //aggregate objects created separately &
{
	String name;
	int cost;
	property(String name, int cost)
	{
		this.name=name;
		this.cost=cost;
		System.out.println("property is created");
	}
	void get_property()
	{
		System.out.println("name of the property is"+name);
		System.out.println("cost of the property is"+cost);
	}
}
class car
{
	String name;
	int cost;
	car(String name, int cost)
	{
		this.name=name;
		this.cost=cost;
		System.out.println("car is created");
	}
	void get_car()
	{
		System.out.println("name of the car is"+name);
		System.out.println("cost of the car is"+cost);
	}
}
class person
{
	brain b=new brain();       //composed objects must be created in main object class @instance level
	heart h=new heart();
	person()
	{
		System.out.println("person is created with brain & heart working");
	}
	void has_A(property p)      // & aggregate objects should be passed as a parameter to one of the method which is present in main object class
	{
		System.out.println("property is accessible");
	}
	void has_A(car c)
	{
		System.out.println("car is accessible");
	}
}
public class Has_A_demo1
{
	public static void main(String[] args) 
	{
		person p1=new person();
		property p=new property("vinay", 2000000);
		car c=new car("lamborgini", 500000000);
		p1.b.get_brain();
		p1.h.get_heart();
		p.get_property();
		c.get_car();
		p1.has_A(c);
		p1.has_A(p);
		p1=null;
	}

}
