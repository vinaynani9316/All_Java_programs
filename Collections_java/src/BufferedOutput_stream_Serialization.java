import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Soccer4 implements Serializable
{
	String name;
	int age;
	int goals;
	float height;
	Soccer4(String name, int age, int goals, float height)
	{
		this.name=name;
		this.age=age;
		this.goals=goals;
		this.height=height;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(goals);
		System.out.println(height);
	}
}
public class BufferedOutput_stream_Serialization 
{
	public static void main(String[] args) throws Exception
	{
		Soccer4 s1=new Soccer4("ronaldo", 32, 65, 5.9f);
		s1.display();
		String path="Desktop//This PC//G://sample//ioprogram//input.txt";
		FileOutputStream fos=new FileOutputStream(path);
		BufferedOutputStream bos=new BufferedOutputStream(fos); // using bos increases the speed of execution & reduces hdd kits.
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		bos.flush(); // flush used because we have to say manually to write object if it not occupies 1024Bytes
	}

}
