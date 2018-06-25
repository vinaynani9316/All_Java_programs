import java.io.*;
public class File_input_stream 
{
	public static void main(String[] args) throws Exception  
	{
		String path1="Desktop//This PC//G://sample//ioprogram//input.txt";
		String path2="Desktop//This PC//G://sample//ioprogram//output.txt";
		FileInputStream fis=new FileInputStream(path1);
		FileOutputStream fos=new FileOutputStream(path2);
		int temp;
		while((temp=fis.read())!=-1)
		{
			fos.write(temp);
		}
		
	}

}
