import java.util.Collections;
import java.util.ArrayList;
class Cricket
{
	String name;
	int age;
	float height;
	int phno;
	char gender;
	public Cricket(String name, int age, float height, int phno, char gender)  // parameterized constructor
	{
		super();
		this.name=name;
		this.age=age;
		this.height=height;
		this.phno=phno;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString()   // to override()'s & printing contents of the object.
	{
		return "[Cricket "+name+" "+age+" "+height+" "+phno+" "+gender+"]";
	}
}
public class Cricketer_app 
{
	public static void main(String[] args)
	{
		ArrayList<Cricket> a=new ArrayList<Cricket>(); //creating object of cricket using ArrayList class
		Cricket c1=new Cricket("dhoni",35,5.6f,120,'m');
		Cricket c2=new Cricket("virat",30,5.8f,345,'m');
		Cricket c3=new Cricket("mithali raj",31,5.5f,786,'m');
		a.add(c1);
		a.add(c2);
		a.add(c3);
		System.out.println(a);
		//Collections.sort(a); compile time error.
	}

}
