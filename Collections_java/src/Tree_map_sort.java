import java.util.TreeMap;

class Soccer
{
	String name;
	int age;
	int average_goals;
	float height;
	public Soccer(String name, int age, int average_goals, float height)
	{
		this.name=name;
		this.age=age;
		this.average_goals=average_goals;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Soccer [name=" + name + ", age=" + age + ", average_goals=" + average_goals + ", height=" + height
				+ "]";
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
	public int getAverage_goals() {
		return average_goals;
	}
	public void setAverage_goals(int average_goals) {
		this.average_goals = average_goals;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}
public class Tree_map_sort 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, Soccer> t=new TreeMap<Integer, Soccer>(); // TreeMap print in sorted order for key values.
		Soccer s1=new Soccer("ronaldo", 32, 80, 5.8f);
		Soccer s2=new Soccer("messi", 30, 50, 5.5f);
		Soccer s3=new Soccer("neymer",28, 43, 5.9f);
		t.put(60, s1);
		t.put(10, s2);
		t.put(90, s3);
		System.out.println(t); // it will print in sorted manner according to unique key values.
	}

}
