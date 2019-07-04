//Question 3: Reverse a string without using a temporary variable. Do not use reverse() in the StringBuffer or StringBuilder APIs
//DONE
public class Question3 {
	static String toReverse;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toReverse = "boing";
		System.out.println("Input: " + toReverse);
		/* Here's how the algorithm works
		 * - Starts at the END of the string
		 * - from there, appends the current char at the end of the array
		 * - then, uses the substring method to get rid of the initial string, leaving only the reversed version
		 * 
		 */

		//System.out.println("Output: " + toReverse);
	}
	public void setToReverse(String n)
	{
		toReverse = n;
	}
	public String specialReverse()
	{
		for(int i = toReverse.length() - 1; i >= 0; i--)
		{
			toReverse += toReverse.charAt(i);
		}
		toReverse = toReverse.substring(toReverse.length()/2);
		return toReverse;
	}
}
