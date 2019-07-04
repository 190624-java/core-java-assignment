package assignment;

// program counts number of characters in a command
// line argument string
public class Q16 {

	public static void main(String[] args) {
		if(args.length != 0) System.out.println(args[0].length());
	}

}
