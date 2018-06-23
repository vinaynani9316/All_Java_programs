import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
class Soccer2
{
	String name;
	int age;
	int goals;
	char gender;
	float height;
	Soccer2(String name, int age, int goals, char gender, float height)
	{
		super();
		this.name=name;
		this.age=age;
		this.goals=goals;
		this.gender=gender;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Soccer2 [name=" + name + ", age=" + age + ", goals=" + goals + ", gender=" + gender + ", height="
				+ height + "]";
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
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}
public class Hash_map_entrySet_method 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Soccer2> h=new HashMap<Integer, Soccer2>();
		Soccer2 s1=new Soccer2("garathbale", 30, 60,'m', 5.8f); //check here complex objects values may be duplicate i.e height in reference s1 & s2 are same but no problem.
		Soccer2 s2=new Soccer2("neymer", 28, 52, 'm', 5.9f);
		Soccer2 s3=new Soccer2("ronaldo", 32, 65, 'm', 5.8f);
		h.put(23, s1);
		h.put(10, s2);
		h.put(48, s3);
		Set<Entry<Integer, Soccer2>> s=h.entrySet(); // using entrySet() gives both unique keys & complex objects values in descending order.
		Iterator<Entry<Integer, Soccer2>> itr=s.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
		
	}

}
