//Question: Write a substring method that accepts a string str and an integer idx and returns the substring contained between 0 and idx-1 inclusive. Do not use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs
//DONE
public class Question5 {
	static String test;
	static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test = "onamonapia";
		index = 5;
	}
	public void setIndex(int i)
	{
		index = i;
	}
	public void setString(String s)
	{
		test = s;
	}
	/*
	 * This algorithm uses an empty string to store the requested subset by adding it character by character
	 */
	public static String substring()
	{
		String subset = "";
		for(int i = 0; i < index-1; i++)
		{
			subset += test.charAt(i);
		}
		return subset;
	}
}
