import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Soccer5 implements Serializable  
{
	String name;
	int age;
	int goals;
	float height;
	char gender;
	Soccer5(String name, int age, int goals, float height, char gender)
	{
		this.name=name;
		this.age=age;
		this.goals=goals;
		this.height=height;
		this.gender=gender;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(goals);
		System.out.println(height);
		System.out.println(gender);
	}
}
public class BufferedInputStream_Deserialization 
{
	public static void main(String[] args) throws Exception 
	{
		Soccer5 s1=new Soccer5("messi", 30, 56, 5.6f, 'm');
		String path="Desktop//This PC//G://sample//ioprogram//input.txt";
		s1.display();
		FileInputStream fis=new FileInputStream(path); 
		BufferedInputStream bis=new BufferedInputStream(fis); //De_serializng the objects. 
		ObjectInputStream ois=new ObjectInputStream(bis); //reconstructing Soccer object on the ram from hard disk. & making it volatile
		Soccer5 s11=(Soccer5)ois.readObject(); //upcasting to create the object Soccer5
	}

}
