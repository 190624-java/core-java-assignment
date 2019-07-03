package assignment_1;
import java.util.ArrayList;

public class Palin {
	
	void palindrone (ArrayList<String> palins, ArrayList<String> names) {
		
		for(int i = 0; i < names.size(); i++) {
			String temp1;
			temp1 =  names.get(i);
			String temp2 = new StringBuffer(temp1).reverse().toString();
			if(temp1.equals(temp2)) {
				palins.add(temp1);
			}
		}
		
	}

}
