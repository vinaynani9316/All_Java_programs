import java.util.*;
public class Farmer 
{
	float p,t,SI;
	static float r;
	static
	{
		r=2.0f;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p value");
		p=sc.nextFloat();
		System.out.println("enter t value");
		t=sc.nextFloat();
		r=2.0f;
	}
	void calc_SI()
	{
		SI=(p*t*r)/100;
	}
	void disp()
	{
		System.out.println("SI is:"+SI);
	}
	public static void main(String[] args) 
	{
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		f1.input();
		f2.input();
		f3.input();
		f1.calc_SI();
		f2.calc_SI();
		f3.calc_SI();
		f1.disp();
		f2.disp();
		f3.disp();
		
	}
	
}
