//Question: Write a program to display the number of characters for a string input. The string should be entered as a command line argument using (String [] args)
//DONE(?)
public class Question16 {
public static String dissect;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dissect = args[0];
		int charCount = 0;
		//This is all probably unnecessary and I could probably get the same result via outputting dissect.length(),
		//but this method stays a bit more literal in regards to the given prompt
		for(int i = 0; i < dissect.length(); i++)
		{
			charCount++;
		}
		System.out.println("Number of characters in input string = " + charCount);
	}
	public static void outputString()
	{
		int charCount = 0;
		//This is all probably unnecessary and I could probably get the same result via outputting dissect.length(),
		//but this method stays a bit more literal in regards to the given prompt
		for(int i = 0; i < dissect.length(); i++)
		{
			charCount++;
		}
		System.out.println("Number of characters in input string = " + charCount);
	}

}
