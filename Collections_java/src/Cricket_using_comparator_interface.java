import java.util.Collections;   // instead of this collections & comparator package we may use io.*;
import java.util.Comparator;
import java.util.ArrayList;
class Cric
{
	String name;
	int age;
	int runs;
	float height;
	int ph_no;
	char gender;
	public Cric(String name, int age, int runs, float height, int ph_no, char gender)  // parameterized constructor
	{
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.height=height;
		this.ph_no=ph_no;
		this.gender=gender;
	}
	@Override                      // overriding to get the contents of the string.
	public String toString() {
		return "Cric [name=" + name + ", age=" + age + ", runs=" + runs + ", height=" + height + ", ph_no=" + ph_no
				+ ", gender=" + gender + "]";
	}
	public String getName() {                         //getters & setters
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getPh_no() {
		return ph_no;
	}
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
class Alpha implements Comparator  // creating separate class that does not effect cric class & implementing Comparator interface
{
	public int compare(Object x, Object y)   //& this is good approach but it can access by any class, so for better encapsulation use Comparator in main class only.
	{
		if(((Cric)(x)).runs > ((Cric)(y)).runs)  // compare() will compare b/w multiple objects.
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class Cricket_using_comparator_interface 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Cric c1=new Cric("dhoni", 40, 50000,5.8f,  6758,'m');
		Cric c2=new Cric("virat", 30, 40000, 5.9f, 9086, 'm');
		Cric c3=new Cric("rahul", 28, 32000, 5.7f, 4532,'m');
		ArrayList<Cric> a=new ArrayList<Cric>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		System.out.println(a);
		Alpha p=new Alpha();
		Collections.sort(a, p);  // comparator use list, comparator object
		System.out.println(a);
		
	}

}
