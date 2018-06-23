
public class Code 
{
	static
	{
		System.out.println("first static");
	}
	static
	{
		System.out.println("second static");
	}
	{
		System.out.println("non-static1");
	}
	{
		System.out.println("non-static2");
	}
	public static void main(String[] args) 
	{
		Code c1=new Code();
		Code c2=new Code();
	}

}
