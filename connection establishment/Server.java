import java.io.*;
import java.net.*;
class Server
{
  	public static void main(String args[]) throws Exception 
	{
		ServerSocket s = new ServerSocket(6600);
		System.out.println(" Before connection");
		Socket ss = s.accept();
		System.out.println(" After connection");
	}
}
