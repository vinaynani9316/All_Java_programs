
public class CodeSegment 
{
	int a,b;
	static int x,y;
	CodeSegment()
	{
		System.out.println("code segment costructor Executed");
	}
	static
	{
		System.out.println("static block executed");
	}
	{
		System.out.println("non static block executed");
	}
	public static void main(String[] args) 
	{
		CodeSegment s=new CodeSegment();
		    s.a=10;
		    s.b=20;
		    {
		    	System.out.println(s.a);
		    	System.out.println(s.b);
		    }
	}

}
