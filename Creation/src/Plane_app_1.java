 abstract class Plane1
{
	abstract void take_off();
	abstract void fly();
	abstract void land();
}
 class Cargo1 extends Plane1
 {
	 void take_off()
	 {
		 System.out.println("Cargo1 took off");
	 }
	 void fly()
	 {
		 System.out.println("cargo1 flying");
	 }
	 void land() 
	 {
		 System.out.println("cargo1 landing");
	 }
 }
 class Passenger1 extends Plane1
 {
	 void take_off()
	 {
		 System.out.println("passenger1 took off");
	 }
	 void fly()
	 {
		 System.out.println("passenger1 flying");
	 }
	 void land()
	 {
		 System.out.println("passenger1 is landing");
	 }
 }
 class Fighter1 extends Plane1
 {
	 void take_off()
	 {
		 System.out.println("fighter1 took off");
	 }
	 void fly()
	 {
		 System.out.println("fighter1 is flying");
	 }
	 void land()
	 {
		 System.out.println("fighter1 is landing");
	 }
 }
 class Airport1 
 {
	 void allow_plane1(Plane1 ref)
	 {
		 ref.take_off();
		 ref.fly();
		 ref.land();
	 }
 }
public class Plane_app_1 
{
	public static void main(String[] args) 
	{
		Cargo1 c1=new Cargo1();
		Passenger1 p1=new Passenger1();
		Fighter1 f1=new Fighter1();
		Airport1 a1=new Airport1();
		// Plane1 p=new Plane1();   can't instantiate main class for abstract class
		a1.allow_plane1(c1);
		a1.allow_plane1(p1);
		a1.allow_plane1(f1);
	}

}
