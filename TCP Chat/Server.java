import java.io.*;
import java.net.*;
import java.util.*;

class Server {
	public static void main(String args[]) throws Exception
	{
		String clientMsg,serverMsg;
		ServerSocket ss = new ServerSocket(8800);
		System.out.println(" Server Side ");
		Socket s = ss.accept();
		System.out.println(" Connection Accepted ");
		
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			clientMsg = br.readLine();
			System.out.println("from client : " + clientMsg);
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter a message : ");
			serverMsg = sc.nextLine();
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeBytes(serverMsg + '\n');
		}
	}
}

