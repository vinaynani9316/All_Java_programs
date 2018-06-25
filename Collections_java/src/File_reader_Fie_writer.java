import java.io.*;
public class File_reader_Fie_writer 
{
	public static void main(String[] args) throws Exception 
	{
		String path1="Desktop//This PC//G://sample//ioprogram//input.txt";
		String path2="Desktop//This PC//G://sample//ioprogram//output.txt";
		FileReader fr=new FileReader(path1);
		FileWriter fw=new FileWriter(path2);
		int temp=0;
		while((temp=fr.read())!=-1)
		{
			fw.write(temp);
		}
		fw.flush();
	}

}
