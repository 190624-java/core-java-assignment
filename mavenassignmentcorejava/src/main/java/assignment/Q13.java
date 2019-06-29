package assignment;

public class Q13 {

	private static int counter = 0;
	private static String nums = "";

	public static void printSeq() {		
		while(counter < 4) {
			// add to back
			if(counter % 2 == 0) { 
				if(nums.equals("")) nums += "0"; // initial
				else if(nums.charAt(0) == '1') nums += "1"; // checks front number
				else nums += "0"; 
			}
			else { // add to front
				if(nums.charAt(0) == '1')  nums = '0' + nums; // if front number is 1 add 0 to front
				else nums = "1" + nums;
			}
			System.out.println(nums);
			counter++;
		}
	}
}
