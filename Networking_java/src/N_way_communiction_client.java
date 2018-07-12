import java.util.*;
import java.io.*;
import java.net.*;
public class N_way_communiction_client 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		Socket csoc=new Socket("127.0.0.1",5932);
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		InputStream is=csoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		for(int i=1; i<=3; i++)                       //n way communication.
		{
			Scanner scan=new Scanner(System.in);
			String temp1=scan.nextLine();
			dos.writeUTF(temp1);
			String temp2=dis.readUTF();
			System.out.println(temp2);
		}
	}

}
