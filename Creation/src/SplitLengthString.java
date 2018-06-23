import java.util.Scanner;
public class SplitLengthString 
{
	public static void main(String[] args) 
	{
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentence");
        s1=scan.nextLine();
		String words[]=s1.split(" ");
		System.out.println(words.length);
		scan.close();
	}
}
