//Question: Write a program that would access two float variables from a class that exists in another package
import forQuestion11.*;
public class Question11 {
public static float var1;
public static float var2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question11Variables q11V = new Question11Variables();
		System.out.println(q11V.getN1());
		System.out.println(q11V.getN2());		
	}
public static void printTwoVariables()
{
	Question11Variables q11V = new Question11Variables();
	System.out.println(q11V.getN1());
	System.out.println(q11V.getN2());
}
public static float getVar1()
{
	Question11Variables q11V = new Question11Variables();
	var1 = q11V.getN1();
	return var1;
}
public static float getVar2()
{
	Question11Variables q11V = new Question11Variables();
	var2 = q11V.getN2();
	return var2;
}
}
