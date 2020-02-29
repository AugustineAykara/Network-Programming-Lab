import java.io.*;
import java.net.*;
import java.util.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
		String clientMsg, replyMsg;
		System.out.println(" Client Side");
		Socket s = new Socket("localhost", 8800);
		DataOutputStream dout;
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" Enter a message: ");
			clientMsg = sc.nextLine();
			dout = new DataOutputStream(s.getOutputStream());
			dout.writeBytes(clientMsg + '\n');
			replyMsg = br.readLine();
			System.out.println(" From Server: " + replyMsg);
		}	
	}
}

