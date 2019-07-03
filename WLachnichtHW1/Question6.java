//Write a program to determine if an integer is even without using the modulus operator (%)
//DONE
public class Question6 {

	public static int determineIfEven;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		determineIfEven = 6;
		//This algorithm takes the given integer and compares half of it to half of the number preceding it
		//Because integers round down, 5/2 = 2, 4/2 = 2, and 5-1=4, therefore if 5/2 = 4/2, then 5 isn't even
		if((determineIfEven/2) == (determineIfEven - 1)/2)
		{
			System.out.println("The integer provided (" +determineIfEven + ") is not even");
		}
		else
		{
			System.out.println("The integer provided (" +determineIfEven + ") is even");
		}
	}
	public void setNumber(int n)
	{
		determineIfEven = n;
	}
	public boolean isEven()
	{
		if((determineIfEven/2) == (determineIfEven - 1)/2)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
