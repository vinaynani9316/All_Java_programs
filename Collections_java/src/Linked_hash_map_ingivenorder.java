import java.util.LinkedHashMap;
class Cricket2
{
	String name;
	int age;
	int runs;
	float average;
	char gender;
	public Cricket2(String name, int age, int runs, float average, char gender)
	{
		super();
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.average=average;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Cricket2 [name=" + name + ", age=" + age + ", runs=" + runs + ", average=" + average + ", gender="
				+ gender + "]";
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
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
public class Linked_hash_map_ingivenorder 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Cricket2> l=new LinkedHashMap<Integer, Cricket2>(); 
		Cricket2 c1=new Cricket2("dhoni",40, 50000, 56.7f, 'm');
		Cricket2 c2=new Cricket2("virat",30, 40000, 60.0f,'m');
		Cricket2 c3=new Cricket2("rahul", 26, 30000, 40.5f, 'm');
		l.put(40, c1); // unique key, value here values may be duplicate allowed.
		l.put(20, c2);
		l.put(80, c3);
		System.out.println(l); // LinkedHashMap print the objects in what order given it wont change
	}

}
