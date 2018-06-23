import java.util.Scanner;
public class Exceptions 
{
	public static void main(String[] args) 
	{
	    System.out.println("inside main()");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		try                                  
		{
		c=a/b;
		System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("error in division");
		}
		System.out.println("program ended in a normal manner");
		sc.close();
	}

}
