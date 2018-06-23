class Plane4
{
	String engine;
	int wheels;
	float fuel;
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
class Cargo4 extends Plane4
{
	void carry_cargo()
	{
		System.out.println("plane carrying cargo");
	}
}
class Passenger4 extends Plane4
{
	void carry_passanger()
	{
		System.out.println("plane carrying passengers");
	}
}
class Fighter4 extends Plane4
{
	void carry_weapons()
	{
		System.out.println("plane carrying weapons");
	}
}
class Planea_app
{
	public static void main(String[] args) 
	{
		Cargo4 c1=new Cargo4();
		Passenger4 p1=new Passenger4();
		Fighter4 f1=new Fighter4();
		c1.take_off();
		c1.fly();
		c1.carry_cargo();
		c1.land();
		p1.take_off();
		p1.fly();
		p1.carry_passanger();
		p1.land();
		f1.take_off();
		f1.fly();
		f1.carry_weapons();
		f1.fly();
	}
	
}
