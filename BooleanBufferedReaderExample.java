package com.BufferedReaderExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanBufferedReaderExample {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 Numbers:");
		boolean a,b,c;
		a=Boolean.parseBoolean(reader.readLine());
		b=Boolean.parseBoolean(reader.readLine());
		c=a||b;
		System.out.println(c);

	}

}
