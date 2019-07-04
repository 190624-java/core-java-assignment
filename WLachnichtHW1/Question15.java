//Question: Write a program that defines an interface having the following methods: addition, subtraction, multiplication, and division. Create a class that implements this interface and provides appropriate functionality to carry out the required operations. Hard code two operands in a test class having a main method that calls the implementing class
//DONE
interface numberModifiers
{
	public int addition(int num1, int num2);
	public int subtraction(int num1, int num2);
	public int multiplication(int num1, int num2);
	public int division(int num1, int num2);

}

class interfaceExample implements numberModifiers
{
	public int addition(int num1, int num2)
	{
		return num1 + num2;
	}
	public int subtraction(int num1, int num2)
	{
		return num1 - num2;
	}
	public int multiplication(int num1, int num2)
	{
		return num1 * num2;
	}
	public int division(int num1, int num2)
	{
		return num1/num2;
	}
}
public class Question15 {
public static int num1;
public static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num1 = 2;
		num2 = 5;
		int result;
		interfaceExample interEx = new interfaceExample();
		result = interEx.addition(num1, num2);
		System.out.println("Result of addition: " + result);
		result = interEx.subtraction(num1, num2);
		System.out.println("Result of subtraction: " + result);
		result = interEx.multiplication(num1, num2);
		System.out.println("Result of multiplication: " + result);
		result = interEx.division(num1, num2);
		System.out.println("Result of division: " + result);
	}
	public void setNum1(int i)
	{
		num1 = i;
	}
	public void setNum2(int i)
	{
		num2 = i;
	}
	public int add()
	{
		interfaceExample interEx = new interfaceExample();
		return interEx.addition(num1, num2);
	}
	public int subtract()
	{
		interfaceExample interEx = new interfaceExample();
		return interEx.subtraction(num1, num2);
	}
	public int multiply()
	{
		interfaceExample interEx = new interfaceExample();
		return interEx.multiplication(num1, num2);
	}
	public int divide()
	{
		interfaceExample interEx = new interfaceExample();
		return interEx.division(num1, num2);
	}
}
