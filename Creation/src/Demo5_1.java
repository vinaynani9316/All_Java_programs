class C
{
	int k;
	C()
	{
		System.out.println("C constructor executed");
	}
	class A extends C
	{
		int i;
		{
			System.out.println("A constructor executed");
		}
	}
	class B extends A
	{
		int j;
		{
			System.out.println("B constructor executed");
		}
	}
	class C extends B
	{
		int k;
		K()
		{
			System.out.println("c constructor executed")  //circular inheritance doesn't support in java
		}
	}
	
}
class Demo5
{
	public static void main(String[] args)
	{
		C c1;
		c1=new C();
		
	}
}

