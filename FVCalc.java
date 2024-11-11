// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		//Getting input from user
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		System.out.println(1+(rate/100));

		double futureValue = currentValue * Math.pow((1 + (rate/100)), n); // Calculate the future value

		//Print output
		String outputAnswer = "After " + n +" years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue;
		System.out.println(outputAnswer);

	}
}