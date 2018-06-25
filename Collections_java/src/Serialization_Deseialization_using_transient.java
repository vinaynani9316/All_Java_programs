import java.io.*;
class Test implements Serializable
{
	int i=10;  //normal variables
	int j=20;
	transient int k=30;  // using transient variables the object will not get serialized. i.e,it won't copy the object on hard disk.
	transient static int l=40;//since static variables are not apart of object no impact on transient keyword & serialization De_serialization doesn't happen but it reads all the objects present in the class.
	transient final int m=50;//final variables are directly serialized by there values. so there is no impact on transient keyword 
}                             //& serialization & De_serialization happens
public class Serialization_Deseialization_using_transient 
{
	public static void main(String[] args) throws Exception
	{
		Test input=new Test();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(input);                                //serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test output=(Test)ois.readObject();                   //De_serialization
		System.out.println("i =" +output.i);
		System.out.println("j =" +output.j);
		System.out.println("k =" +output.k);// using transient keyword leads to initialize default values. because serialization & De_serialization,
		System.out.println("l =" +output.l);// never happens for transient keyword so they are volatile in nature.
		System.out.println("m =" +output.m);
	}

}
