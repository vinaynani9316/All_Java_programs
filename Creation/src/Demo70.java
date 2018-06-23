class A
{
	int i;
}
class B extends A
{
	void setData(int x, int y)
	{
		super.i=x;
		i=y;
	}
	void disp()
	{
		System.out.println("A i is "+super.i);
		System.out.println("B i is"+i);
	}
}
class Demo70
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.setData(100, 500);
		b1.disp();
		
	}
}
