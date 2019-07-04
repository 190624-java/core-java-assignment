//Question: Write a program having a concrete subclass that inherits three abstract methods from a superclass. Provide the following three implementations in the subclass corresponding to the abstract methods in the superclass
//Check for uppercase characters in a string, and return 'true' or 'false' depending if any are found
//Convert all of the lowercase characters to uppercase in the input string, and return the result
//Convert the input string to integer and add 10, output the result to the console
//Create an appropriate class having a main method to test the above setup
//DONE
abstract class supClass
{
	public abstract boolean checkUppercase(String str);
	public abstract String convertLowercaseToUppercase(String str);
	public abstract int convertStringToIntegerPlusTen(String str);	
}

class subClass extends supClass
{
	public boolean checkUppercase(String str)
	{
		boolean hasUppercase = !str.equals(str.toLowerCase());
		return hasUppercase;
	}
	public String convertLowercaseToUppercase(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
				//Character.toUpperCase(str.charAt(i));
			}
		}
		String upper = str.toUpperCase();
		return upper;
	}
	public int convertStringToIntegerPlusTen(String str)
	{
		int strToInt = 0;
		for(int i = 0; i < str.length(); i++)
		{
			strToInt += Character.getNumericValue(str.charAt(i));
		}
		strToInt += 10;
		//System.out.println(strToInt);
		return strToInt;
	}
}
public class Question18 {
public static String string;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World!";
		subClass sub = new subClass();
		System.out.println(sub.checkUppercase(str));
		System.out.println(sub.convertLowercaseToUppercase(str));
		sub.convertStringToIntegerPlusTen(str);
		
	}
	public static void setString(String s)
	{
		string = s;
	}
	public static boolean checkForUppercase()
	{
		subClass sub = new subClass();
		boolean isUpper = sub.checkUppercase(string);
		return isUpper;
	}
	public static String convertLowerToUpper()
	{
		subClass sub = new subClass();
		return sub.convertLowercaseToUppercase(string);
	}
	public static int stringToIntPlusTen()
	{
		subClass sub = new subClass();
		return sub.convertStringToIntegerPlusTen(string);
	}
}
