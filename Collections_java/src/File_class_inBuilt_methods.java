import java.io.*;
public class File_class_inBuilt_methods 
{
	public static void main(String[] args) 
	{
		String path="C:\\Users\\vinod\\git\\All_Java_programs\\Collections_java";
		File f=new File(path);
		System.out.println(f.canRead()); // these are inBuilt() of File class
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getClass());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
	}

}
