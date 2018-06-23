class C
{
	int k;
	C()
	{
		System.out.println("c's constructor executed");
	}

	class A extends C
	{
		int i;
		A()
		{
			System.out.println("A's constructor executed");
		}
	}
	class B extends A  //class in java can never be related in a circular manner 
	{
		int j;
		B()
		{
		System.out.println("b's constructor executed");
	    }
	}
public void main(String[] args) 
	  {
	 	B b1;
		b1=new B();
	  }

    }




