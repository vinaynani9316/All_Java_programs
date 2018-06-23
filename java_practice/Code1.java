
public class Code1 
{
	int a,b;
	static int x,y,z;
	Code1()
	{
		System.out.println("code1 constructor executed");
	}
	static
	{
		System.out.println("static block executed");
	}
	static void staticDisp()
	{
		System.out.println("static() executed");
	}
	void nonstaticDisp()
	{
		System.out.println("non static () executed");
	}
	{
		System.out.println("non static block executed");
	}
	public static void main(String[] args) 
	{
		Code1 c1=new Code1();
		c1.staticDisp();
		c1.nonstaticDisp();
		
	}

}
