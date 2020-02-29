import java.io.*;
import java.net.*;
import java.util.*;

class Server {
	public static void main(String[] arg) throws IOException{
		Scanner s = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket(6060);
		System.out.println(" Server Side");
		
		byte[] sendData = new byte[1024];
		byte[] receiveData = new byte[1024];
		String msg;
		
		DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
		ds.receive(dp);
		
		msg = new String(receiveData);
		System.out.println(" Message from Client " + msg);
		
		int port = dp.getPort();
		InetAddress ia = dp.getAddress();	
	}
}		
