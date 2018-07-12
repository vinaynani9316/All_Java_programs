import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class One_way_server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket listner=new ServerSocket(8409); 
		System.out.println("server is ready to accept the request");
		Socket ssoc=listner.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String temp=dis.readUTF(); //reading from client
		System.out.println(temp);
	}

}
//The port number should be same as client & server it varies from 0 to 65535 
//once the port number is used & run the program with same port number gives error: address already in use.
//if Server & client port number vary then it give error: connection refused.
// first run the server & then client & press any key. it will end the process in server i.e,is one way communication.
// to kill the process id go_to > commandPrompt > run > netstat -a -o -n > enter > taskkill /F /PID portno;example:8409> enter