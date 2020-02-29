import java.io.*;
import java.net.*;
import java.util.*;

class Server {
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(8000);
		System.out.println(" Server Side ");
		Socket s1 = ss.accept();
		System.out.println(" Connection Accepted from Client1");
		Socket s2 = ss.accept();
		System.out.println(" Connection Accepted from Client2");
	}
}

