package com.revature.utils;

import java.util.Scanner;

public class IOHelper {

	/**
	 * 
	 * @param s the scanner to get input from the keyboard
	 * @return true if reply is "y" or "Y"; false otherwise
	 */
	public boolean getContinueReply(Scanner s) {
		try{
			String reply = s.next();
			if(reply.equals("y") || reply.equals("Y")) return true;
			else return false;
		} catch(Exception e) {
			return false;
		}		
	}
}
