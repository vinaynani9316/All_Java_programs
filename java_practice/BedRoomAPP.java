class Room
{
	int l;
	int b;
	Room(int x, int y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		int res;
		res=l*b;
		System.out.println("area is"+res);
	}
}
class BedRoom extends Room
{
	int h;
	BedRoom(int x,int y,int z)
	{
	super(x,y);
	h=z;
	}
	void volume()
	{
		int res;
		res=l*b*h;
		System.out.println("volume is"+res);
	}
	
}
class BedRoomAPP
{
	public static void main(String[] args)
	{
		BedRoom b=new BedRoom(40,50,60);
		b.area();
		b.volume();
	}
	
}
