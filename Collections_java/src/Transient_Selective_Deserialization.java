import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Soccer7 implements Serializable
{
	transient String name;
	int goals;
	int age;
	transient float height;
	Soccer7(String name, int goals, int age, float height)
	{
		this.name=name;
		this.goals=goals;
		this.age=age;
		this.height=height;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(goals);
		System.out.println(age);
		System.out.println(height);
	}
}
class Transient_Selective_Deserialization
{
	public static void main(String[] args) throws Exception
	{
		Soccer7 s7=new Soccer7("neymer", 52, 28, 5.8f);
		s7.display();
		String path="Desktop//This PC//G://sample//ioprogram//input.txt";
		FileInputStream fis=new FileInputStream(path); 
		BufferedInputStream bis=new BufferedInputStream(fis); //De_serialiazation never happen for transient keyword objects & it initializes
		ObjectInputStream ois=new ObjectInputStream(bis);     //to defalut values.
		Soccer7 s71=(Soccer7)ois.readObject();
		s71.display();
	}
}

