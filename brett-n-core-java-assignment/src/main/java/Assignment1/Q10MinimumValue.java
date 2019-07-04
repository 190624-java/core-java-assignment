package Assignment1;

public class Q10MinimumValue {

	
	public void minValue(int x, int y) {
		
		int mv;
		
		mv = (x < y) ? x : y; // minimum value = if x < y return x, else return y
		
		System.out.println(mv);
		
	}
	
}