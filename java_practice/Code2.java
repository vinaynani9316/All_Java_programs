public class Code2 
{
	int a,b,c;
	static int x,y,z;
	{                //a non static variable can access non static block
		a=10;
		b=20;
		c=30;
	}
	static      // a static variable can access a static block
	{
		x=111;
		y=112;
		z=113;
	}
	void non_static_display()    // a non static variable can access non static()  
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void static_display() // a static variable can access a static()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
	public static void main(String[] args) 
	{
		Code2 c2;
		c2=new Code2();
		c2.non_static_display();
		c2.static_display();
		
	}

}
