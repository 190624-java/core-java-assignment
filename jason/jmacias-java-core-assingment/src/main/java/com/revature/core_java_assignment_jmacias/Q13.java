package com.revature.core_java_assignment_jmacias;
//Instructions:
//Display the triangle on the console as follows using any type of loop.
/* 		0
* 		1 0
* 		1 0 1
* 		0 1 0 1
*/
//Do NOT use a simple group of print statements to accomplish this.
public class Q13 {
// setting up boolean to be toggled
private static int toggleVal = 1;

// setting up function to return values alternating between 1 and 0,
// starting with 1 to match requred problem pattern
private static int toggle() {
switch (toggleVal) {
case 0:
	toggleVal = 1;
	break;
case 1:
	toggleVal = 0;
	break;
default:
	System.out.println("You did something wrong");
}
return toggleVal;
}

public static void printPyramid() {
// nested loop to print 4 lines, each with space-separated, alternating
// zeros and ones (the pattern of which continues from line to line)
// the length of which increased by one for each line.
for (int i = 0; i < 4; i++) {
	for (int j = 0; j < i + 1; j++) {
		System.out.print(toggle() + " ");
	}
	System.out.println("");
}
System.out.println("");
}

}
