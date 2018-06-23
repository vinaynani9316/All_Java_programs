class Over
{
	double add(int x,double y)
	{
		return x+y;
	}
	double add(float x, double y, int z)
	{
		return x+y+z;
	}
	double add(double x, float y)
	{
		return x+y;
	}
	double add(float x, double y)
	{
		return x*y;
	}
	int mul(int x, int y)
	{
		return x*y;
	}
	
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		int a=2, b=5;
		float i=4.5f, j=5.7f;
		double p=5.4, q=9.80;
		Over d=new Over();
		System.out.println(d.add(a,q));
		System.out.println(d.add(i,p,b));
		System.out.println(d.add(q,j));
		System.out.println(d.add(j,p));
		System.out.println(d.mul(a,b));
	
		
	}

}
