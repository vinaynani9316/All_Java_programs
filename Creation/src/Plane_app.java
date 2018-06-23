class Plane  // run time polymorphism.
{
	void take_off()
	{
		System.out.println("plane took off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}
class Cargo extends Plane
{
	void take_0ff()
	{
		System.out.println("cargo palne is took off");
	}
	void fly()
	{
		System.out.println("cargo plane is flying");
	}
	void land()
	{
		System.out.println("cargo plane is landing");
	}
}
class Passenger extends Plane
{
	void take_off()
	{
		System.out.println("passenger plane is took off");
	}
	void fly()
	{
		System.out.println("passenger plane is flying");
	}
	void land()
	{
		System.out.println("passenger plane is landing");
	}
}
class Fighter extends Plane
{
	void take_off()
	{
		System.out.println("fighter plane is took off");
	}
	void fly()
	{
		System.out.println("fighter plan is flying");
	}
	void land()
	{
		System.out.println("fighter plane is landing");
	}
}
class Airport
{
	void allowPlane(Cargo ref)              //run time polymorphism
	{
		ref.take_0ff();                    //from here method over riding
		ref.fly();
		ref.land();
	}
	void allowPlane(Passenger ref)
	{
		ref.take_off();
		ref.fly();
		ref.land();
	}
	void allowPlane(Fighter ref)
	{
		ref.take_off();
		ref.fly();
		ref.land();
	}
}

public class Plane_app 
{
	public static void main(String[] args) 
	{
		Cargo c=new Cargo();
		Passenger p=new Passenger();
		Fighter f=new Fighter();
		Airport a=new Airport();
		a.allowPlane(c);
		a.allowPlane(p);
		a.allowPlane(f);
	}

}
