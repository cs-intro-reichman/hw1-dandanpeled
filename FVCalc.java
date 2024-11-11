// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		//Getting input from user
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		double futureValue = (currentValue * Math.pow((1 + rate), n))/100; // Calculate the future value

		//Print output
		String outputAnswer = "After " + n +" years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue;
		System.out.println(outputAnswer);

	}
}