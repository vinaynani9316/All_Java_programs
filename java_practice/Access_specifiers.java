package info;
class Access
{
	protected void display()   //during method over riding the child class() should be same access specifier.
	{
		System.out.println("inside parent dispaly");
	}

}
class Children extends Access
{
	default void display()    //in case if child class() wants to change in access specifier don't give weaker access specifier than parent. may give public or protected.
	{
		System.out.println("inside children display");
	}
}
class Access_specifiers
{
	public static void main(String[] args) 
	{
		Children c=new Children();
		   c.display();
		
	}
}