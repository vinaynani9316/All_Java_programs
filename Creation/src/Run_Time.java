// method overriding in java
// Base Class
class Parent1
{
	void show() 
	{ 
		System.out.println("Parent's show()"); 
	}
}

// Inherited class
class Child2 extends Parent1
{
	// This method overrides show() of Parent
	@Override
	void show() 
	{ 
		System.out.println("Child's show()"); 
	}
}
// Driver class
class Run_Time
{
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent1 obj1 = new Parent1();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent1 obj2 = new Child2();
		obj2.show();
	}
}

