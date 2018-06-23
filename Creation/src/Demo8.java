class Parent
{
	void disp()
	{
		System.out.println("inside parent disp()");
	}
}
class Child extends Parent
{
	void disp()
	{
		System.out.println("inside child disp()");
	}
}
class Child1 extends Parent
{
	void disp()
	{
		System.out.println("inside child1 disp()");
	}
}
class Demo8
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		Child c1=new Child();
		Child1 c2=new Child1();
		Parent ref;
		ref=p1;
		ref.disp();
		ref=c1;
		ref.disp();
		ref=c2;
		ref.disp();
		
	}
}
