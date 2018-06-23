public class Count 
{
	int a,b;
	static int count;
	{
		count++;
	}
	public static void main(String[] args) 
	{
		Count c1,c2,c3,c4;
		c1=new Count();
		c2=new Count();
		c3=new Count();
		c4=new Count();
		System.out.println("The no. of objects are" + count);
		
	}

}
