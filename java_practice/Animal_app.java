class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animalis sleeping");
	}
	void breathe()
	{
		System.out.println("animal is breathing");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger hunts & eat");
	}
}
class Dear extends Animal
{
	void eat()
	{
		System.out.println("dear grazes & eat");
	}
}
class Monkey extends Animal
{
   void eat()
   {
	    System.out.println("monkey steals & eat");
   }
}
public class Animal_app 
{
	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		Dear d=new Dear();
		Monkey m=new Monkey();
		t.eat();
		t.sleep();
		t.breathe();
		d.eat();
		d.sleep();
		d.breathe();
		m.eat();
		m.sleep();
		m.breathe();
	}

}
