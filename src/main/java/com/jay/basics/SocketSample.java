package com.jay.basics;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketSample {
	public static void main(String[] args) {
		try (Socket s = new Socket("time.nist.gov",13)){
			
			s.setSoTimeout(15000);//15secs
			try(Scanner scanner  = new Scanner(s.getInputStream())){
			    while(scanner.hasNext()) {
			     System.out.println(scanner.nextLine());	
			   }
			}catch(Exception e) {
				throw e;
			}
						
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}