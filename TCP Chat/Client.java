import java.io.*;
import java.net.*;
import java.util.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
		String clientMsg, replyMsg;
		System.out.println(" Client Side");
		Socket clientsocket=new Socket("localhost",8800);
		DataOutputStream outtoserver;
		BufferedReader br;
		Scanner s;
		while(true)
		{
			s = new Scanner(System.in);
			System.out.println("Enter a message: ");
			clientMsg=s.nextLine();
			outtoserver=new DataOutputStream(clientsocket.getOutputStream());
			outtoserver.writeBytes(clientMsg + '\n');
			br= new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
			replyMsg = br.readLine();
			System.out.println("from server: " + replyMsg);
		}	
	}
}

