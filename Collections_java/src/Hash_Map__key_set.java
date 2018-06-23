import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Cricket4
{
	String name;
	int age;
	int runs;
	char gender;
	Cricket4(String name, int age, int runs, char gender)
	{
		super();
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Cricket4 [name=" + name + ", age=" + age + ", runs=" + runs + ", gender=" + gender + "]";
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
public class Hash_Map__key_set 
{
	public static void main(String[] args)
	{
		HashMap<Integer, Cricket4> h=new HashMap<Integer, Cricket4>();
		Cricket4 c1=new Cricket4("dhoni",40,50000,'m'); //complex homogeneous objects
		Cricket4 c2=new Cricket4("virat",30,35000,'m');
		Cricket4 c3=new Cricket4("raina",33,45000,'m');
		h.put(17, c1); // unique key & values
		h.put(40, c2);
		h.put(10, c3);
		Set<Integer> s=h.keySet(); // using keySet() it only print unique key's.
		Iterator<Integer> itr=s.iterator(); //iterator class only traverse in one end. 
		while(itr.hasNext()==true) // hasNext() whether the next object present or not & return boolean
		{
			System.out.println(itr.next()); // next() print objects
		}
    }

}
