import java.util.Collections;
import java.util.ArrayList;
class Cricketer implements Comparable // implementing Comparable interface
{
	String name;
	int age;
	int runs;
	int ph_no;
	char gender;
	public Cricketer(String name, int age, int runs, int ph_no, char gender)
	{
		super();
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.ph_no=ph_no;
		this.gender=gender;
	}
	public String getName() {     //getters & setters
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
	public String toString()    // over riding 
	{
		return "[Cricketer "+name+" "+age+" "+runs+" "+ph_no+" "+gender+"]";
	}
	public int compareTo(Object y)   // comparing one object with other using compareTO() i.e it will check >or < 0r equals.
	{
		if(this.runs>((Cricketer)(y)).runs) //comparing the objects with in Cricketer class it is not good approach
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class Cricket_app_Using_comparable_interfce 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Cricketer c1=new Cricketer("dhoni", 35, 40000, 7865, 'm');
		Cricketer c2=new Cricketer("virat", 30, 30000, 6543,'m');
		Cricketer c3=new Cricketer("anil", 40, 65000, 7654, 'm');
		ArrayList<Cricketer> a=new ArrayList<Cricketer>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		System.out.println(a);
		Collections.sort(a);    // sorting homogeneous elements based on runs.
		System.out.println(a);
		
		
	}

}
