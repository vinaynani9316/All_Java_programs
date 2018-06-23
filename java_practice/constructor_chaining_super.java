package info;
class Chaining
{
	Chaining()
	{
		System.out.println("inside chaining constructor");
	}
}
class Chaining1 extends Chaining
{
	Chaining1()
	{
		super();
	}
}
class constructor_chaining_super
{
   public static void main(String[] args) 
   {
	   Chaining c=new Chaining();
	   
   }
}
