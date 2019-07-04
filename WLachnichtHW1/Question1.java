//Question 1: Create code that performs a bubble sort on the following array: 1,0,5,6,3,2,3,7,9,8,4
//DONE
public class Question1 {

	public static void main(String[] args) {
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		int after[];
		//after = bubbleSort(arr);
	}
	public int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("On pass " + i + ":");
			printArray(arr);
		}
		return arr;
	}
	public int[] bubbleSort()
	{
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("On pass " + i + ":");
			printArray(arr);
		}
		return arr;
	}
	static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "");
		}
		System.out.println();
	}
}
