import java.time.*;
import java.time.format.DateTimeFormatter;

//Question: Write a program that demonstrates the switch case. Implement the provided functionalities in the cases.
//DONE
public class Question14 {
public static int findSqRoot;
public static double foundSqRoot;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		switch (num){
		case 1:
			int findSqRoot = 36;
			System.out.print("The square root of " + findSqRoot + " is ");
			System.out.println(Math.sqrt(findSqRoot));
			break;
		case 2:
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("It is currently " + dtf.format(now));
			break;
		case 3:
			String toSplit = "I am learning Core Java";
			String[] strArray = new String[5];
			int jIndex = 0;
			strArray = toSplit.split(" ");
			for(int i = 0; i < strArray.length; i++)
			{
				System.out.println("Index " + i + ": " + strArray[i]);
			}
			break;
		}
	}
public static void switchUseCase(int n)
{
	switch (n){
	case 1:
		findSqRoot = 36;
		System.out.print("The square root of " + findSqRoot + " is ");
		System.out.println(Math.sqrt(findSqRoot));
		foundSqRoot = Math.sqrt(findSqRoot);
		break;
	case 2:
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("It is currently " + dtf.format(now));
		break;
	case 3:
		String toSplit = "I am learning Core Java";
		String[] strArray = new String[5];
		int jIndex = 0;
		strArray = toSplit.split(" ");
		for(int i = 0; i < strArray.length; i++)
		{
			System.out.println("Index " + i + ": " + strArray[i]);
		}
		break;
	}
}
}
