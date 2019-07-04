//Question: Display a triangle on the console using any type of loop. Do NOT use a simple group of print statements to accomplish this
//DONE
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The triangle provided goes as follows:
		/* 0
		 * 1 0
		 * 1 0 1
		 * 0 1 0 1
		 */
		//When read from left to right, starting at the top, it is simply alternating 0 and 1
		
		int[] triangleArray = new int[10];
		for(int i = 0; i < triangleArray.length; i++)
		{
			if(i % 2 == 0)
			{
				triangleArray[i] = 0;
			}
			else
			{
				triangleArray[i] = 1;
			}
		}
		int space = 0;
		int currentspace = 0;
		for(int i : triangleArray)
		{
			if(currentspace == space)
			{
				System.out.println(triangleArray[i]);
				space++;
				currentspace = 0;
			}
			else
			{
				System.out.print(triangleArray[i] + " ");
				currentspace++;
			}
		}
	}
public static void printTriangle()
{
	int[] triangleArray = new int[10];
	for(int i = 0; i < triangleArray.length; i++)
	{
		if(i % 2 == 0)
		{
			triangleArray[i] = 0;
		}
		else
		{
			triangleArray[i] = 1;
		}
	}
	int space = 0;
	int currentspace = 0;
	for(int i : triangleArray)
	{
		if(currentspace == space)
		{
			System.out.println(triangleArray[i]);
			space++;
			currentspace = 0;
		}
		else
		{
			System.out.print(triangleArray[i] + " ");
			currentspace++;
		}
	}
}
}
