package main.kyu7;

import java.util.Arrays;

public class DescendingOrder {

	public static int sortDesc(final int num) {

		
		// solution 1
        char[] numArray = String.valueOf(num).toCharArray();
        Arrays.sort(numArray);
        return Integer.parseInt(new StringBuilder(new String(numArray)).reverse().toString());
		
	}

}
