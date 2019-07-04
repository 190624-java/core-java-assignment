import java.util.ArrayList;

//Question: Write a program that stores the strings in an ArrayList and saves all the palindromes in another ArrayList
//DONE
public class Question8 {
public static ArrayList palindromes = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayL = new ArrayList();
		ArrayList palindromes = new ArrayList();
		arrayL.add("karan");
		arrayL.add("madam");
		arrayL.add("tom");
		arrayL.add("civic");
		arrayL.add("radar");
		arrayL.add("jimmy");
		arrayL.add("kayak");
		arrayL.add("john");
		arrayL.add("refer");
		arrayL.add("billy");
		arrayL.add("did");
		for(int i = 0; i < arrayL.size(); i++)
		{
			//I could have just put the isPalindrome method into the if statement,
			//but I wanted to be safe and also slightly improve code readability
			//Plus this way I was able to print the value of palindrome to console easier
			//during testing.
			boolean palindrome = isPalindrome((String)arrayL.get(i));
			if(palindrome)
			{
				palindromes.add(arrayL.get(i));
			}
		}
		for(int i = 0; i < palindromes.size(); i++)
		{
			System.out.println(palindromes.get(i));
		}
	}
	public static void keepPalindromes()
	{
		ArrayList arrayL = new ArrayList();
		arrayL.add("karan");
		arrayL.add("madam");
		arrayL.add("tom");
		arrayL.add("civic");
		arrayL.add("radar");
		arrayL.add("jimmy");
		arrayL.add("kayak");
		arrayL.add("john");
		arrayL.add("refer");
		arrayL.add("billy");
		arrayL.add("did");
		for(int i = 0; i < arrayL.size(); i++)
		{
			//I could have just put the isPalindrome method into the if statement,
			//but I wanted to be safe and also slightly improve code readability
			//Plus this way I was able to print the value of palindrome to console easier
			//during testing.
			boolean palindrome = isPalindrome((String)arrayL.get(i));
			if(palindrome)
			{
				palindromes.add(arrayL.get(i));
			}
		}
		for(int i = 0; i < palindromes.size(); i++)
		{
			System.out.println(palindromes.get(i));
		}
	}
	public static boolean isPalindrome(String word)
	{
		return word.equals(new StringBuilder(word).reverse().toString());
	}
}
