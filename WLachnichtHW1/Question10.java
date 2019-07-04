//Question: Find the minimum of two numbers using ternary operators
//DONE
public class Question10 {

	static int numOne;
	static int numTwo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numOne = 6;
		numTwo = 2;
		int minimum;
		minimum = (numOne > numTwo) ? numTwo : numOne;
		System.out.print("Out of the two numbers, the minimum is " + minimum);
	}
	public void setNumOne(int i)
	{
		numOne = i;
	}
	public void setNumberTwo(int i)
	{
		numTwo = i;
	}
	public int minimumByTernary()
	{
		int min = (numOne > numTwo) ? numTwo : numOne;
		return min;
	}
}
