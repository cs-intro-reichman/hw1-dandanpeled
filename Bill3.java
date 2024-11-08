// Splits a restaurant bill evenly among three diners.

import java.text.ParsePosition;

public class Bill3 {
	public static void main(String[] args) {
		// Getting input from users
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int value = Integer.parseInt(args[3]);

		double amount = Math.ceil(value/3.0); // Calculating the bill

		//Print output
		String outputAnswer = "Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + amount + " Shekels each.";
		System.out.println(outputAnswer);
	}
}
