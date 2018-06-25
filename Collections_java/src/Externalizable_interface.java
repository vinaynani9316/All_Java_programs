import java.io.*;
class Football implements Externalizable  //  Externalizable interface is fast in execution.
{
	String name;
	int age;
	int goals;
	float height;
	public Football(String name, int age, int goals, float height) // parameterized constructor for file output stream.
	{
		this.name=name;
		this.age=age;
		this.goals=goals;
		this.height=height;
	}
	public Football()   //zero parameter constructor for file input stream.
	{
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(goals);
		System.out.println(height);
	}
	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException  //it is used @ De_serialization
	{
		//name=oi.readUTF();  //by un commenting this serialization & de_serialization Happens
		age=oi.readInt();
		//goals=oi.readInt();
		height=oi.readFloat();
	}
	@Override
	public void writeExternal(ObjectOutput oo) throws IOException  //it is used @ serialization
	{
		//oo.writeUTF(name);
		oo.writeInt(age);
		//oo.writeInt(goals);
		oo.writeFloat(height);
    }
}
class Externalizable_interface
{
	public static void main(String[] args) throws Exception
	{
		Football f1=new Football("pele",58,147,5.8f); //creating new object of football.
		FileOutputStream fos=new FileOutputStream("text"); //Serialization
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(f1);
		FileInputStream fis=new FileInputStream("text"); //De_serialization
		ObjectInputStream ois=new ObjectInputStream(fis);
		Football f2=(Football)ois.readObject(); //down casting 
		f1.display();
		f2.display();
	}
}
