//Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers using the enchanced FOR loop
//DONE
public class Question12 {
public static int[] array = new int[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
for(int i = 0; i < array.length; i++)
{
	array[i] = i + 1;
}
		for(int n: array)
		{
			if(n % 2 == 0)
			{
				System.out.print(n + " ");
			}
		}
	}
public static void arrayEnhancedForLoop()
{
	for(int i = 0; i < array.length; i++)
	{
		array[i] = i + 1;
	}
			for(int n: array)
			{
				if(n % 2 == 0)
				{
					System.out.print(n + " ");
				}
			}
		}
}

