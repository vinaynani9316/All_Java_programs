import java.util.*;
public class Anagrams 
{
	public static void main(String[] args) 
	{
		String s1;
		String s2;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter s1");
		s1=scan.nextLine();
		System.out.println("enter s2");
		s2=scan.nextLine();
		s1=s1.replaceAll("//s", "");
		s2=s2.replaceAll("//s2", "");
		if(s1.length()!=s2.length())
		{
			System.out.println("given strings are not anagrams");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char array1[]=s1.toCharArray();
			char array2[]=s2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			Boolean value=Arrays.equals(array1, array2);
			if(value==true)
			{
				System.out.println("s1 & s2 are anagrams");
			}
			else
			{
				System.out.println("s1 & s2 are not anagrams");
			}
		}
		scan.close();
		
	}

}
