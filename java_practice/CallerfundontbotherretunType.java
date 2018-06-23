class Demo5
{
	void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
	int add(int x, int y)  //method over loading caller function never bother about return type whether it is be different or same
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
}

public class CallerfundontbotherretunType 
{
	public static void main(String[] args) 
	{
		Demo5 X=new Demo5();
		int a,b;
		a=5;
		b=6;
		X.add(a,b);
		
	}

}
