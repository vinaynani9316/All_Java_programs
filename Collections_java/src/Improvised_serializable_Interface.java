import java.io.*;
class Tennis implements Serializable // it acts as both marker & non marker interface ,it can do both complete & selective serialization.
{
	String name;
	int no_of_games;
	int age;
	float height;
	public Tennis(String name, int no_of_games, int age, float height)
	{
		this.name=name;
		this.no_of_games=no_of_games;
		this.age=age;
		this.height=height;
	}
	public Tennis()
	{
		
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(no_of_games);
		System.out.println(age);
		System.out.println(height);
	}
	private void writeObject(ObjectOutput oo) throws IOException //by calling writeObject & readObject we can perform selective serialization.
	{                                                            //i.e, is non_marker interface.
		//oo.writeUTF(name);
		oo.writeInt(no_of_games);
		oo.writeInt(age);
		//oo.writeFloat(height);
	}
	private void readObject(ObjectInput oi) throws IOException, ClassNotFoundException
	{
		//name=oi.readUTF();
		no_of_games=oi.readInt();
		age=oi.readInt();
		//height=oi.readFloat();
	}
}
public class Improvised_serializable_Interface 
{
	public static void main(String[] args) throws Exception
	{
		Tennis t1=new Tennis("p.v.sindu",320,29,5.7f);  
		FileOutputStream fos=new FileOutputStream("text");
		ObjectOutputStream oos=new ObjectOutputStream(fos); //serialization
		oos.writeObject(t1);                                     
		FileInputStream fis=new FileInputStream("text");
		ObjectInputStream ois=new ObjectInputStream(fis);   //de_serialization
		Tennis t2=(Tennis)ois.readObject();                 //explicit or down casting          
		t1.disp();
		t2.disp();
	}

}
