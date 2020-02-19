import java.io.*;
import java.net.*;
class Client 
{
	  public static void main(String[] args)throws Exception
	{
		System.out.println(" Before sending the connection");
		Socket s = new Socket("localhost",6600);
		System.out.println(" After connection");
	}
}
