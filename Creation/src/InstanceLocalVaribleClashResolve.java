class Key
{
	String name,age,height;
	void setData(String name,String age,String height)
	{
		this.name=name;
		this.age=age;
		this.height=height;
	}
}
public class InstanceLocalVaribleClashResolve 
{
	public static void main(String[] args) 
	{
		Key k1;
		k1=new Key();
		Key k2;
		k2=new Key();
		k1.setData("rama","21","5.8");
		System.out.println(k1.name);
		System.out.println(k1.age);
		System.out.println(k1.height);
		k2.setData("sita","20","5.5");
		System.out.println(k2.name);
		System.out.println(k2.age);
		System.out.println(k2.height);
	}

}
