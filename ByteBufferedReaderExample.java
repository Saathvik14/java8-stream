package com.BufferedReaderExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteBufferedReaderExample {

	public static void main(String[] args)throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 byte Numbers:");
		byte a,b,c;
		a=Byte.parseByte(reader.readLine());
		b=Byte.parseByte(reader.readLine());
		c=(byte) (a+b);
		System.out.println("Addition of two numbers:\t"+c);
		

	}

}
