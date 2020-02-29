import java.io.*;
import java.net.*;
import java.util.*;

class Client1
{
	public static void main(String args[]) throws Exception
	{
		System.out.println(" Client-1 Side");
		Socket s = new Socket("localhost", 8000);
	}
}

