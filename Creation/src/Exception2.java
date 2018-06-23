import java.util.*;
public class Exception2
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println("enter an element");
			a[i]=sc.nextInt();
		}
		try
		{
		    for(i=0;i<=5;i++)
		    {
			   System.out.println(a[i]);
		    }
		}
		catch(Exception e)
		{
			System.out.println("error in accessing the array");
		}
		System.out.println("exiting main()normally");
		sc.close();
      }
}

		
