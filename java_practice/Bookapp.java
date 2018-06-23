public class Bookapp 
{
	public static void main(String[] args) 
	{
		Book b=new Book();
		b.setPage(100);
		b.setPage(-99);
		int m=b.getpage();
		System.out.println("value of pages" +m);
	}
}
class Book
{
	private int pages;
	public void setPage(int x)
	{
		if(x>0)
		{
			pages=x;
		}
	}
	public int getpage()
	{
		return pages;
	}
}