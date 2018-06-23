import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Crick      // here we doesn't implement Comparator interface we create it in class only.
{
	String name;
	int age;
	int runs;
	int ph_no;
	char gender;
	public Crick(String name, int age, int runs, int ph_no, char gender)   //parameterized constructor
	{
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.ph_no=ph_no;
		this.gender=gender;
	}
	public String getName() {        //mutators & accessors
		return name;
	}
	@Override                              // over riding toString to get contents of the object
	public String toString() {
		return "Crick [name=" + name + ", age=" + age + ", runs=" + runs + ", ph_no=" + ph_no + ", gender=" + gender
				+ "]";
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
}
public class Cricket_using_comparator_interface_mainclass 
{
	public static void main(String[] args) 
	{
		ArrayList<Crick> a=new ArrayList<Crick>();    //creating ArrayList object
		a.add(new Crick("dhoni", 40, 40000, 8976,'M'));     //Homogeneous data
		a.add(new Crick("virat", 30, 32000, 5432, 'M'));
		a.add(new Crick("yuvraj", 35, 60000,0342, 'M'));
		System.out.println(a);
		Collections.sort (a, new Comparator<Object>()//we are creating Comparator object in main class only so that we can better encapsulation,
		{
		public int compare(Object x, Object y)                  // & it can only access by main class.
		 {
			if(((Crick)(x)).runs >((Crick)(y)).runs)
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		 }
		
	   });
		System.out.println(a);

    }
}
