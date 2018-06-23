public class Studentapp 
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		s1.setData("rama","21","5.7");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		
	}

}
class Student1
{
	String name;
	int age;
	float height;
	void setData(String name,String age,String height)
	{
		name=name;
		age=age;
		height=height;
	}
		
}

