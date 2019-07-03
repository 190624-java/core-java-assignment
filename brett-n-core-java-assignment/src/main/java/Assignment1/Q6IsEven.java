package Assignment1;

public class Q6IsEven {

	public static boolean isEven(int num) {

		boolean isEven = true;
		
		for(int i = 1; i <= num; i++)
			
			isEven = !isEven; //Flag variable (switches from true to false every increment)
			
			return isEven;

	}

}