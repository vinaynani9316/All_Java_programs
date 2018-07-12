import java.util.*;
import java.io.*;
import java.net.*;
public class N_way_communication_server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket listner=new ServerSocket(5932);
		System.out.println("server is ready to accept the request");
		Socket ssoc=listner.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		OutputStream os=ssoc.getOutputStream();
		DataOutputStream dos= new DataOutputStream(os);
		for(int i=1; i<=3; i++)                //n way communication.
		{
			String temp1=dis.readUTF();
			System.out.println(temp1);
			Scanner scan=new Scanner(System.in);
			String temp2=scan.nextLine();
			dos.writeUTF(temp2);
		}
	}

}
