package assignment_1;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables used in the questions
		int[] arr = {1,0,5,6,3,2,3,7,9,8,4}; //Q1
		String cat = "cat"; //Q3
		int N = 6; //Q4
		String str = "Revature";//Q5
		int idx = 5;//Q5
		int x = 7;//Q6
		
		String[] array = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"}; //Q8
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(array));//Q8
		ArrayList<String> palins = new ArrayList<String>();//Q8
		int[] numbs = new int[100];//Q9
		ArrayList<Integer> primes = new ArrayList<Integer>();//Q9
		float a = 4.25f;//Q10
		float b = 10f;//Q10 
		float c;//Q10
		int[] hundred = new int[100];//Q12
		
		
		
		
		//Q1
		Bubble_Sort sort = new Bubble_Sort();
		sort.sort(arr);
		sort.printIntArray(arr);
		
		//Q2
		Fib fib = new Fib();
		fib.printFib();
		
		//Q3
		System.out.print(cat + " ");
		Rev_String rev = new Rev_String();
		cat = rev.revString(cat);
		System.out.println(cat);
		
		//Q4
		Factorial math = new Factorial();
		System.out.println(math.factorial(N));
		
		//Q5
		Sub_String section = new Sub_String();
		str = section.sub(str, idx);
		System.out.println(str);
		
		//Q6
		Even evenodd = new Even();
		if(evenodd.check(x)) {
			System.out.println("its even");
		}else {
			System.out.println("its odd");
		}
		
		//Q7
		
		
		//Q8
		Palin palCheck = new Palin();
		palCheck.palindrone(palins, names);
		
		System.out.print("Original List: ");
		for (int i = 0; i < names.size()-1; i++) {
			System.out.print(names.get(i) + ", ");
		}
		System.out.println(names.get(names.size()-1));
		
		System.out.print("Palindrone List: ");
		for (int i = 0; i < palins.size()-1; i++) {
			System.out.print(palins.get(i) + ", ");
		}
		System.out.println(palins.get(palins.size()-1));
		
		//Q9
		for(int i = 1; i <= numbs.length-1; i++) {
			numbs[i] = i;
		}
		Prime printprimes = new Prime();
		printprimes.primecalc(numbs, primes);
		
		//Q10
		Ternary compare = new Ternary();
		c = compare.comp(a, b);//This will work with all primitive number data types numbers must be same data type
		System.out.println("The minimum of " + a + " and " + b + " is " + c);
		
		//Q11
		Access gotIt = new Access();
		System.out.println("Got these from a second package: " + gotIt.a1 + ", " + gotIt.b1);
		
		//Q12
		Enhanced_For evens = new Enhanced_For();
		evens.setHundred(hundred);
		evens.printEven(hundred);
		
		//Q13
		Triangle printer = new Triangle();
		printer.print();
		
		//Q14
		
	}

}

