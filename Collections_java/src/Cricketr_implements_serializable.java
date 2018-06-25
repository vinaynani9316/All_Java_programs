import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
@SuppressWarnings("serial")
class Cricktr implements Serializable   // implementing serializable interface.
{
	String name;
	int age;
	int runs;
	float avg;
	char gender;
	Cricktr(String name, int age, int runs, float avg, char gender)
	{
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.avg=avg;
		this.gender=gender;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(runs);
		System.out.println(avg);
		System.out.println(gender);
	}
}
public class Cricketr_implements_serializable 
{
	public static void main(String[] args) throws Exception
	{
		Cricktr c=new Cricktr("sachin", 40, 50000, 50.5f, 'm');
		c.display();
		String path="Desktop//This PC//G://sample//ioprogram//input.txt";
		FileOutputStream fos=new FileOutputStream(path);   //copying cricketer object from RAM to hard disk. to make non volatile
		@SuppressWarnings("resource")
		ObjectOutputStream oos=new ObjectOutputStream(fos);  // persistent object store on HardDisk that is non volatile.
		oos.writeObject(c);
	}

}
