import java.util.ArrayList;
//Question: Create an arrayList and insert integers 1 through 10. Display the arraylist. Add all the even numbers up and display the result. Add all the odd numbers up and display the result. Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
//DONE
public class Question19 {
public static ArrayList arrayL = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayL = new ArrayList(10);
		ArrayList primeHold = new ArrayList();
		for(int i = 1; i < 11; i++)
		{
			arrayL.add(i - 1, i);
		}
		for(int i = 0; i < arrayL.size(); i++)
		{
			System.out.print(arrayL.get(i) + " ");
		}
		System.out.println();
		int evenTotal = 0;
		for(int i = 1; i < arrayL.size(); i += 2)
		{
			evenTotal += (int)arrayL.get(i);
		}
		System.out.println("The total sum of all even numbers within the ArrayList is " + evenTotal);
		int oddTotal = 0;
		for(int i = 0; i < arrayL.size(); i += 2)
		{
			oddTotal += (int)arrayL.get(i);
		}
		System.out.println("The total sum of all odd numbers within the ArrayList is " + oddTotal);
		for(int i = 0; i < arrayL.size(); i++)
		{
			if(isPrime((int)arrayL.get(i)))
			{
				primeHold.add(arrayL.get(i));
			}
		}
		arrayL.removeAll(primeHold);
		for(Object o : arrayL)
		{
			System.out.print(o + " ");
		}
	}
	public static void arrayManipulation()
	{
		ArrayList primeHold = new ArrayList();
		for(int i = 1; i < 11; i++)
		{
			arrayL.add(i - 1, i);
		}
		for(int i = 0; i < arrayL.size(); i++)
		{
			System.out.print(arrayL.get(i) + " ");
		}
		System.out.println();
		int evenTotal = 0;
		for(int i = 1; i < arrayL.size(); i += 2)
		{
			evenTotal += (int)arrayL.get(i);
		}
		System.out.println("The total sum of all even numbers within the ArrayList is " + evenTotal);
		int oddTotal = 0;
		for(int i = 0; i < arrayL.size(); i += 2)
		{
			oddTotal += (int)arrayL.get(i);
		}
		System.out.println("The total sum of all odd numbers within the ArrayList is " + oddTotal);
		for(int i = 0; i < arrayL.size(); i++)
		{
			if(isPrime((int)arrayL.get(i)))
			{
				primeHold.add(arrayL.get(i));
			}
		}
		arrayL.removeAll(primeHold);
		for(Object o : arrayL)
		{
			System.out.print(o + " ");
		}
	}
	public static boolean isPrime(int num)
	{
		boolean prime = true;
		for(int j = 2; j <= num/2; j++)
		{
			if(num % j == 0)
			{
				prime = false;
				return prime;
			}
		}
		return prime;
	}

}
