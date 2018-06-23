class Plane12
{
	void fly()
	{
		System.out.println("plane is flying");
	}
}
class Fighter12 extends Plane12
{
	void fly()
	{
		System.out.println("fighter plane is fying");
	}
	void launch_missile()
	{
		System.out.println("missle launched");
	}
}

public class Plane_app1 
{
	public static void main(String[] args) 
	{
		Fighter12 f=new Fighter12();     //up casting compiler will done automatically
		Plane12 ref;
		ref=(Plane12)f;
		ref.fly();
	//	ref.launch_missle();   should call down casting explicitly like below
		((Fighter12)(ref)).launch_missile();
	}

}
