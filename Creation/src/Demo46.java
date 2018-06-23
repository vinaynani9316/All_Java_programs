public class Demo46 
{
       public static void main(String[] args) 
       {
		String s1="rama"+"sita";
		String s2="rama"+"sita";
		if(s1==s2)
		{
			System.out.println("s1 & s2 are pointing to same object");
			
		}
		else
		{
			System.out.println("s1 & s2 are not pointing to same object");
		}
		String s3,s4,s5,s6;
		s3="rama";
		s4="sita";
		s5=s3+s4;
		s6=s3+s4;
		if(s5==s6)
		{
			System.out.println("s5 & s6 are pointing to same object");
			
		}
		else
		{
			System.out.println("s5 & s6 are not pointing to same object");
		}
		
		}
}