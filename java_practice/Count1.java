public class Count1 
{
	int a,b;
	static int count;
	{
		count++;
	}
	Count1()
	{
		
	}
	Count1(int x)
	{
		a=x;
	    b=40;
	}
	Count1(int x, int y)
	{
		a=x;
		b=y;
	}
	public static void main(String[] args) 
	{
		Count1 c1,c2,c3,c4,c5;
		c1=new Count1();
		c2=new Count1();
		c3=new Count1();
		c4=new Count1(10);
		c5=new Count1(10,20);
		System.out.println("the no of objects are" +count);
		
	}

}
