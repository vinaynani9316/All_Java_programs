import java.util.Scanner;

public class Ascii 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int a=(int)ch;
			System.out.println("value :" +ch);
			System.out.println("Ascii value :" +a);
		}
		
	}

}
