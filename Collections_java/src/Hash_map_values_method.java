import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
class Soccer1
{
	String name;
	int age;
	int goals;
	float height;
	Soccer1(String name, int age, int goals, float height)
	{
		this.name=name;
		this.age=age;
		this.goals=goals;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Soccer1 [name=" + name + ", age=" + age + ", goals=" + goals + ", height=" + height + "]";
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
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}

public class Hash_map_values_method
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Soccer1> h=new HashMap<Integer,Soccer1>();
		Soccer1 s1=new Soccer1("messi",32,60,5.5f);
		Soccer1 s2=new Soccer1("ronaldo",30,84,5.8f);
		Soccer1 s3=new Soccer1("neymer",28,43,5.9f);
		h.put(30, s1); 
		h.put(10, s2);
		h.put(80, s3);
		Collection<Soccer1> c=h.values(); //values() only print values not unique keys
		Iterator<Soccer1> itr=c.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
	}

}
