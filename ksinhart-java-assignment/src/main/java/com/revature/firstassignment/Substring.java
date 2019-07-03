package com.revature.firstassignment;

public class Substring {
	public String substring(String str, int idx) {
		if(idx>=str.length()) {
			return str;
		}
		StringBuilder strb=new StringBuilder();
		for(int i=0;i<idx;i++) {
			strb=strb.append(str.charAt(i));
		}
		
		return strb.toString();
	}
}
