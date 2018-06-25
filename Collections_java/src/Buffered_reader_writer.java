import java.io.*;
public class Buffered_reader_writer 
{
	public static void main(String[] args)
	{
		String path1=null;
		String path2=null;
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		String temp=null;
		try
		{
			path1="Desktop//This PC//G://sample//ioprogram//input.txt";
			path2="Desktop//This PC//G://sample//ioprogram//output.txt";
	        fr=new FileReader(path1);
			fw=new FileWriter(path2);
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			while((br.readLine())!=null)
			{
				bw.write(temp);
			}
		}
		catch(Exception e)
		{
			System.out.println("file transfer activity interrupted");
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
				bw.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("closing operation interrupted");
			}
		}
		
	}
}