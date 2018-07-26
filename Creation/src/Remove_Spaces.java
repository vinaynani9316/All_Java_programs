import java.util.Scanner;

public class Remove_Spaces 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		String str, strWithOutSpaces;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		str=sc.nextLine();
		strWithOutSpaces = str.replaceAll(" ", " ");
		char[] strArray=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(i=0; i<strArray.length; i++)
		{
			if((strArray[i] != ' ') && (strArray[i]!='\t'))
			{
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
		sc.close();
		
	}

}
