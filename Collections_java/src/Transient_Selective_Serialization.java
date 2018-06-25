import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Soccer6 implements Serializable
{
	transient String name;// by using transient keyword the respective object will not under go Serialization it will volatile i.e on RAM only
	int goals;
	int age;
	transient float height;
	Soccer6(String name, int goals, int age, float height)
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
public class Transient_Selective_Serialization 
{
   public static void main(String[] args) throws Exception 
   {
	   Soccer6 s6=new Soccer6("neymer", 52,28, 5.8f);
	   s6.display();
	   String path = "Desktop//This PC//G://sample//ioprogram//input.txt";
	   FileOutputStream fos=new FileOutputStream(path);
	   BufferedOutputStream bos=new BufferedOutputStream(fos);
	   ObjectOutputStream oos=new ObjectOutputStream(bos);  // the transient keyword objects never construct on Hard disk drive.
	   oos.writeObject(s6);
   }
 }
