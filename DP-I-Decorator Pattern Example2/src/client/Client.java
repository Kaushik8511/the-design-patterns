package client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import decorator.LowerCaseInputStream;

public class Client {
	public static void main(String[] args) throws IOException {
		int c;
		
		StringBuffer buffer = new StringBuffer("DASDAW DASDAS das adsa dasdSADadsa DSADA");
		byte[] bs = buffer.toString().getBytes();
		
		InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bs));
		while((c = in.read()) >= 0) {
			System.out.println((char) c);
		}
		
		in.close();
	}
}
