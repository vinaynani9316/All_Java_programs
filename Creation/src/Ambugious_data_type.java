class Vinay
{
	void add(int x, long y)
	{
		long z;
		z=x+y;
		System.out.println(z);
	}
	void add(long x, int y)
	{
		long z;
		z=x+y;
		System.out.println(z);
	}
	
}
public class Ambugious_data_type
{
	public static void main(String[] args) 
	{
		Vinay v= new Vinay();
		int a,b;
		a=10;
		b=20;
		v.add(a,b);
		
	}

}
