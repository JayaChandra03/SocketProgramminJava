package com.jay.basics;

import java.io.IOException;
import java.net.Socket;

public class LowPortScanner {

	public static void main(String[] args) {
      String host = "127.0.0.1";
      for(int i=1;i<=1024;i++) {
    	   try {
    		   System.out.println("PORT ::"+i);
			Socket s = new Socket(host,i);
			System.out.println("server at port : "+i+" is running...");
			s.close();
		} catch (IOException e) {
			//e.printStackTrace();
		}
      }
	}

}
