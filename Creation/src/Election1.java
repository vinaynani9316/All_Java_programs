import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Election1 
{
	static String electionWinner(String[]votes)
	{
		if(votesItem>votes)
			return res;
	}
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[]args) throws IOException
	{
		/*String path1 = "D://sample//in.txt";
		String path2 = "D://sample//out.txt";
		FileReader fr=new FileReader(path1);
		FileWriter fw=new FileWriter(path2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);*/
		int votesCount=sc.nextInt();
		String[]votes=new String[votesCount];
		for(int i=0; i<votesCount; i++)
		{
			String votesItem=sc.nextLine();
			votes[i]=votesItem;
		}
		String res=electionWinner(votes);
		 System.out.println(res);
		
		
	}

}
