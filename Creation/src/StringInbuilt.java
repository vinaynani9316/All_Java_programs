public class StringInbuilt {
	public static void main(String[] args) 
	{
		String s1= "RajaRamMohanRoy";
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("R"));
		System.out.println(s1.lastIndexOf("R"));
		System.out.println(s1.contains("Roy"));
		System.out.println(s1.contains("abhi"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(4,15));
	}

}
