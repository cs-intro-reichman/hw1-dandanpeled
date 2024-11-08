// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int numberToCheck = Integer.parseInt(args[0]); //Number to be checked - input from user

		//Extracting numbers from Input
		int hundreds = numberToCheck/100;
		int tens = (numberToCheck/10)%10;
		int ones = numberToCheck%10;

		//Print output
		String outputAnswer = hundreds + " hundreds, " + tens + " tens, " + ones +" ones.";

		System.out.println(outputAnswer);
	}
}
