package org.tnsindia.bufferedreader;

import java.io.IOException;
import java.io.InputStreamReader;
//Demo on BufferedReader class
public class BufferedReader {

	public BufferedReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new
				InputStreamReader(System.in));
		String name=b.readLine();
		System.out.println(name);

	}

	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
