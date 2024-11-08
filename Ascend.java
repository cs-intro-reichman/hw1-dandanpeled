// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {

		int lim = Integer.parseInt(args[0]); // Range input from user

		//Random numbers in the range lim
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);;
		int c = (int)(Math.random() * lim);;

		//Calculating Min, Max, Mid
		int minNum = Math.min(Math.min(a,b), c);
		int maxNum = Math.max(Math.max(a, b) , c);
		int midNum = (a+b+c)-(minNum+maxNum);
		
		//Print output
		String outputDescendAnswer =  minNum +" < " + midNum + " < "+maxNum;
		String outputAscendAnswer =  maxNum +" > " + midNum + " > "+minNum;

		System.out.println(outputDescendAnswer);
		System.out.println(outputAscendAnswer); 

	}
}
