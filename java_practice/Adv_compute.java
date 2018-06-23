class Compute1
{
	void add()
	{
		int a,b,c;
		a=20;
		b=80;
		c=a+b;
		System.out.println(c);
	}
}
abstract interface Compute2     //by default it is abstract because only declaration is given in this interface not body implementation
{
	void sub();                //by default it is public 
}
class Advance extends Compute1 implements Compute2   //in this case first extending a class then implementing method of compute2 interface 
{
	public void sub()        //so make public when implementing interface method
	{
		int a,b,c;
		a=9;
		b=4;
		c=a-b;
		System.out.println(c);
	}
}
public class Adv_compute
{
	public static void main(String[] args) 
	{
	    Advance ad=new Advance();               // creating object of reference compute1 & compute2
		ad.add();
		ad.sub();
	}

}

