import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Two_way_client 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		Socket csoc=new Socket("127.0.0.1",6943);
		
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		InputStream is=csoc.getInputStream();
		DataInputStream dis=new DataInputStream(is); 
		
		Scanner scan=new Scanner(System.in);
		String temp1=scan.nextLine();
		dos.writeUTF(temp1);         // sending to server
		            
		String temp2=dis.readUTF();
		System.out.println(temp2); // accepting from server 
	}

}
