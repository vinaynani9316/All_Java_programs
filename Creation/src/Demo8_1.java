public class Demo8_1 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("sachin");
	    System.out.println(s1.capacity());
	    System.out.println(s1.length());
	    s1.append("is a great batsman");
	    System.out.println(s1.capacity());
	    System.out.println(s1.length());
	    s1.append("he is an indian");
	    System.out.println(s1.capacity());
	    System.out.println(s1.length());
		
		
	}

}
