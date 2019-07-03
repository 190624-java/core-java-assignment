//Question: Write a program that can compute N factorial
//DONE
public class Question4 {
	int fact;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//computeFactorial(4);
	}
	public void setFactorial(int n)
	{
		fact = n;
	}
public int computeFactorial()
{
	int factorial = 1;
	for(int i = 0; i < fact; i++)
	{
		factorial = factorial * (fact - i);
	}
	System.out.print(factorial);
	return factorial;
}
}
