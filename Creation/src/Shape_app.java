import java.util.Scanner;
abstract class Shape        //abstract class with method declaration & method body these are impure abstract classes
{
	float area;
	abstract void input();      //abstract() with out body declaration in abstract class
	abstract void calc_area();
	void disp()                       //a method which have body in abstract class are called concrete() 
	{
		System.out.println("area is:"+area);
	}
}
class Square extends Shape
{
	float l;
	void input()          //body implementation for abstract()
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("enter l");
		l=sc.nextFloat();
	}
	void calc_area()
	{
		area=l*l;
	}
}
class Rectangle extends Shape
{
	float l,b;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l");
		l=sc.nextFloat();
		System.out.println("enter b");
		b=sc.nextFloat();
	}
	void calc_area()
	{
		area=l*b;
	}
}
class Circle extends Shape
{
	float r;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r");
		r=sc.nextFloat();
	}
	void calc_area()
	{
		area=3.14f*r*r;
	}
}
class Geometry
{
	void allow_shape(Shape ref)        //run time polymorphism
	{
		ref.input();
		ref.calc_area();
		ref.disp();
	}
}
class Shape_app
{
	public static void main(String[] args) 
	{
		Shape s,r,c;                   //Inheriting objects
		s=new Square();
		r=new Rectangle();
		c=new Circle();
		Geometry g=new Geometry();   
		g.allow_shape(s);
		g.allow_shape(r);
		g.allow_shape(c); 
	}
}

