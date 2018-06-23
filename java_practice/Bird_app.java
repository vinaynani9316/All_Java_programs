package info;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird    //if abstract()called in Bird abstract class & even abstract method body is not given in child class then
{                                    // call it as abstract class for child class & declare body.
	void fly()
	{
		System.out.println("eagles fly high at altitude");
	}
	abstract void eat();
	{
		
	}
}
final class Serpent_eagle extends Eagle      // use final keyword to don't inherit the properties of child abstract class.
{
	void eat()
	{
		System.out.println("serpent eagle eats only snakes");
	}
}
final class Golden_eagle extends Eagle
{
	void eat()
	{
		System.out.println("golden eagle eats only fish");
	}
}
class Sparrow extends Bird
{
	void eat()
	{
		System.out.println("sparrows eat grains");
	}
	void fly()
	{
		System.out.println("sparrows fly low at low altitude");
	}
}
class Crow extends Bird
{
	void eat()
	{
		System.out.println("crows eat fish");
	}
	void fly()
	{
		System.out.println("crows fly at mid alitude");
	}
}
class Sky                                      //run time polymorphism
{
	void allow_Bird(Bird ref)
	{
		ref.eat();
		ref.fly();
	}
}
public class Bird_app 
{
	public static void main(String[] args) 
	{
		Serpent_eagle se=new Serpent_eagle();
		Golden_eagle ge=new Golden_eagle();
		Sparrow sp=new Sparrow();
		Crow c=new Crow();
		Sky s=new Sky();
		s.allow_Bird(se);
		s.allow_Bird(ge);
		s.allow_Bird(sp);
		s.allow_Bird(c);
	}

}
