package Assignment1;
import java.util.ArrayList;

public class Q8Palindrome {

	public void isPalindrome() {

		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();

		al1.add("karan");
		al1.add("madam");
		al1.add("tom");
		al1.add("civic");
		al1.add("radar");
		al1.add("jimmy");
		al1.add("kayak");
		al1.add("john");
		al1.add("refer");
		al1.add("billy");
		al1.add("did");
		al1.add("914"); //Test case

		for (int i = 0; i < al1.size(); i++) {

			al2.add(i, new StringBuilder(al1.get(i)).reverse().toString()); //Getting i, changing it to a string, reversing,
																			//and storing it in arraylist 2

		}
		System.out.println(al1);
		System.out.println(al2);

		for (int i = 0; i < al1.size(); i++) {

			al1.retainAll(al2); //Compares and retains same elements of arraylist 1 and arraylist 2 after reversal

			al3.add(al1.get(i)); //Adds retained elements from arraylist1 to arraylist3

		}

		System.out.println(al3);

	}
}