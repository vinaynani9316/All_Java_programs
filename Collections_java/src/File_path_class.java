import java.io.*;
public class File_path_class 
{
	public static void main(String[] args)
	{
		String path="G:\\New folder";
		File f=new File(path);  //file is a class in that we are using two inbuilt() exits() & isFile().
		if(f.exists()==true)
		{
			if(f.isFile()==true)
			{
				System.out.println("the given path contains a file");
			}
			else
			{
				System.out.println("the given path contais a folder");
			}
		}
		else
		{
			System.out.println("the given path is invalid");
		}
	}
}