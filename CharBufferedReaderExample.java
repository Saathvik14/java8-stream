package com.BufferedReaderExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharBufferedReaderExample {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		char initials;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter initials");
		initials=(char)reader.read();
		
		System.out.println(initials);
		
	}

}
