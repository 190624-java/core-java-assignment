package com.revature.firstassignment;

public class BubbleSort {
	//1,0,5,6,3,2,3,7,9,8,4
	public static void bubble(int[] input)
    {
        int n=input.length;
        for (int pass=1;pass<=n-1;++pass)
        {
            
            //improve: after each pass we need to look at 1 fewer elements(pair)
            for (int i=0;/*i<n-1*/i<n-pass;++i)
            {
                if (input[i]>input[i+1])
                {
                    int tmp=input[i];
                    
                    input[i]=input[i+1];
                    input[i+1]=tmp;
                }
            }
        }
        //SK.printArray(input);
        for(int a:input) {
        	System.out.print(a+",");
        }
        System.out.println();
        
    }
}
