public class Demo4_1 
{
	public static void main(String[] args) 
	{
		Keyword d1,d2,d3;
		d1=new Keyword();
		d2=new Keyword();
		d3=new Keyword();
		d1.a=10;
		d1.b=20;
		d2.a=70;
		d2.b=80;
		d3.a=70;
		d3.b=40;
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d3.a);
		System.out.println(d3.b);
     }

}
class Keyword
{
	int a,b;
}
