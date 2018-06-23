package info;
class Chain
{
	Chain()
	{
		this(10);
		System.out.println("zero parameterised constructor");
	}
	Chain(int a)
	{
		this(10,20);
		System.out.println("one parameterised constructor");
	}
	Chain(int a,int b)
	{
		this(10,20,30);
		System.out.println("two parameterised constructor");
	}
	Chain(int a,int b, int c)
	{
		System.out.println("three parameterised construtor");
	}
}
class Constructor_chaining_this
{
	public static void main(String[] args) 
	{
        new Chain();		
	}
}
