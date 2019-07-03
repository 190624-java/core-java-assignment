//Question 2: Write a program to display the first 25 Fibonacci numbers beginning at 0
public class Question2 {
	static int fibOne;
	static int fibTwo;
public static void Main(String[] args)
{
	fibOne = 0;
	fibTwo = 1;
	System.out.print(fibOne + " " + fibTwo + " ");
	for(int i = 0; i < 24; i++)
	{
		if(i % 2 == 0)
		{
			fibTwo = fibOne + fibTwo;
			System.out.print(fibTwo + " ");
		}
		if(i % 2 != 0)
		{
			fibOne = fibOne + fibTwo;
			System.out.print(fibOne + " ");
		}
		
	}
}
public static int[] printFibonacci()
{
	int[] fibArray = new int[25];
	fibArray[0] = 0;
	fibArray[1] = 1;
	fibOne = 0;
	fibTwo = 1;
	for(int i = 0; i < 25; i++)
	{
		if(i % 2 == 0)
		{
			fibTwo = fibOne + fibTwo;
			fibArray[i] = fibTwo;
			//System.out.print(fibTwo + " ");
		}
		if(i % 2 != 0)
		{
			fibOne = fibOne + fibTwo;
			fibArray[i] = fibOne;
			//System.out.print(fibOne + " ");
		}
		
	}
	for(int i = 0; i < fibArray.length; i++)
	{
		System.out.print(fibArray[i] + " ");
	}
	return fibArray;
}
}
