package info;

public class Demo7 
{   
	public static void main(String[] args) 
	{
		String s1=new String("vinay");
		String s2=s1.intern();
        String s3="vinay";
		if(s2==s3)
		{
			System.out.println("vinay copied to constant pool");
		}
		else
		{
			System.out.println("vinay not copied to costant pool");
		}
		
	}

}
