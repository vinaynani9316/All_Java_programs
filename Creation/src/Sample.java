import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter String");
		String str=scan.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)=='r' )
			{
				System.out.print(77);
			}
			else if(str.charAt(i)=='a')
			{
				System.out.print(88);
			}
			else if(str.charAt(i)=='v')
			{
				System.out.print(99);
			}
			else if(str.charAt(i)=='i')
			{
				System.out.print(32);
			}
			else if(str.charAt(i)==' ')
			{
				System.out.print(48);
			}
			else if(str.charAt(i)=='9')
			{
				System.out.print(67);
			}
			else
			{
				System.out.println("error");
			}
		}
		scan.close();
		
	}

}
