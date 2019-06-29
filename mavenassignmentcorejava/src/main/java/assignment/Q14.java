package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Q14 {

	public static  void switchDemo(int n) {
		
		switch(n) {
		case 1:
			Random ran = new Random();
			int ranNum = ran.nextInt(21); // from 0 to 20
			System.out.println(Math.pow(ranNum, 2));
			break;
		case 2:
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			System.out.println(formatter.format(new Date()));
			break;
		case 3:
			String str = "I am learning Core Java";
			String[] s = new String[2];
			s = str.split("i");
			System.out.println(s[0]);
			System.out.println(s[1]);
		}
	}
}
