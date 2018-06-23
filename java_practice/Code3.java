public class Code3 
{
	int a,b,c;
	static int x,y,z;
	static    // a non static variables can't access static block
	{
		a=1;
		b=2;
		c=10;
	}
	{
		x=10;     //a static variable can access non static block
		y=20;
		z=30;
	}
	void non_static_disp()
	{
		System.out.println(x);   // a static variable can access non static()
		System.out.println(y);
		System.out.println(z);
	}
	static void staic_disp()    // a non static variable can't access static()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Code3 c3=new Code3();
		c3.non_static_disp();

		
		
	}

}
