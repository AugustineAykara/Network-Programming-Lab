import java.io.*;
import java.net.*;
import java.util.*;	

class Client {
	public static void main(String[] arg) throws Exception {	
		DatagramSocket ds = new DatagramSocket();
		Scanner s = new Scanner(System.in);
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(" Client Side ");
		
		byte[] sendData = new byte[1024]; 
		byte[] receiveData = new byte[1024];
		
		String msg = new String();
		System.out.println(" Enter the message : ");
		msg = s.nextLine();
		sendData = msg.getBytes();
		
		DatagramPacket dp = new DatagramPacket(sendData, sendData.length, ia, 6060);	
		ds.send(dp);
		System.out.println(" Message sent to the server");	
	}
}		
