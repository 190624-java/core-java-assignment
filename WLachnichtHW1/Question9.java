//Question: Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers to the console.
import java.util.*;
public class Question9 {
public static ArrayList primeCheck = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		ArrayList arrayL = new ArrayList();
		ArrayList primeCheck = new ArrayList();
		for(int i = 1; i < 101; i++)
		{
			arrayL.add(i);
		}
		/*for(int i = 0; i < 100; i++)
		{
			System.out.print(arrayL.get(i) + " ");
		}
		*/
		//the algorithm for determining if any of the numbers in the array are prime
		//I did not create this algorithm on my own, I found it on stackoverflow and adapted it
		//to my own code.
		//The algorithm inputs the current number % x, where x can be any number from 3 to x/2
		//It starts at 3 because 2 is a prime number itself, so rather than make a special case for 2,
		//I just omitted it entirely
		//It only goes up to x/2 because the smallest number that can divide into x (besides 1) would always be 2
		//
		for(int i = 1; i < 101; i++)
		{
			for(int j = 2; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime == true)
			{
				primeCheck.add(i);
				isPrime = false;
			}
			isPrime = true;
		}
		for(int i = 0; i < primeCheck.size(); i++)
		{
			System.out.print(primeCheck.get(i) + " ");
		}
	}
public static void OneToOneHundredPrimes()
{
	boolean isPrime = true;
	ArrayList arrayL = new ArrayList();
	for(int i = 1; i < 101; i++)
	{
		arrayL.add(i);
	}
	/*for(int i = 0; i < 100; i++)
	{
		System.out.print(arrayL.get(i) + " ");
	}
	*/
	//the algorithm for determining if any of the numbers in the array are prime
	//I did not create this algorithm on my own, I found it on stackoverflow and adapted it
	//to my own code.
	//The algorithm inputs the current number % x, where x can be any number from 3 to x/2
	//It starts at 3 because 2 is a prime number itself, so rather than make a special case for 2,
	//I just omitted it entirely
	//It only goes up to x/2 because the smallest number that can divide into x (besides 1) would always be 2
	//
	for(int i = 1; i < 101; i++)
	{
		for(int j = 2; j <= i/2; j++)
		{
			if(i % j == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime == true)
		{
			primeCheck.add(i);
			isPrime = false;
		}
		isPrime = true;
	}
	for(int i = 0; i < primeCheck.size(); i++)
	{
		System.out.print(primeCheck.get(i) + " ");
	}
}
}
