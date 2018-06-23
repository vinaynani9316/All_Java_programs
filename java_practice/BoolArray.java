class BoolArray 
{
    boolean[]b=new boolean[3];
	int count=0;
	BoolArray()//if you create method or not Default constructor will be created in heap memory, bcoz class name & constructor names are same so they don't have return type.
	{
		
	}
	void set(boolean[]x,int i) //parameterized constructor
	{
		x[i]=true;
		++count;
	}
	 void test() // parameterized constructor
	{
	   if(b[0]&& b[1]|b[2])
	     count++;
	   if(b[1]&& b[++count-2])
	     count+=7;
	   System.out.println("count="+ count);//parameterized constructors execute after the creation of object because they have return type 'void' they are like methods only.
	 }
	public static void main(String[] args)
	{
		BoolArray ba=new BoolArray();//class name & object creation name i.e,constructor name should be same & default constructors execute during the creation of object only.
		ba.set(ba.b, 0);              
		ba.set(ba.b, 2);
		ba.test();
	}                              
  
}
