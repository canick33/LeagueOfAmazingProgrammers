package lotteryNumbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		/* Create 5 random lottery numbers from 1 to 50 */
		
		/* Define some constants for the lottery number generation */
		int numberOfLotteryNumbers = 5;
		int maxValueOfLotteryNumber = 50;
		int minValueOfLotteryNumber = 1;
		String lotteryMessage;
		
		/* Declare an array to hold the numbers */
		int[] lotteryNumbers = new int[numberOfLotteryNumbers];
			
		/* Create our random number generator */
		Random randomNumber = new Random();
		
		/* Initialize the lottery message */
		lotteryMessage = "Welcome to the Lottery Numbers Picker\n" +
						 "Your numbers for today are:\n";
		
		/* Loop thru all the numbers, creating random numbers */
		for (int i=0; i<numberOfLotteryNumbers; i++) {
			/* Generate a random number, and store in the lottery number array */
			lotteryNumbers[i] = randomNumber.nextInt((maxValueOfLotteryNumber - minValueOfLotteryNumber)+1) +
					minValueOfLotteryNumber;
			/* Add a number to the lottery numbers string */
			lotteryMessage += Integer.toString(lotteryNumbers[i]) + " ";
		}
		
		/* Print out the numbers */
		JOptionPane.showMessageDialog(null, lotteryMessage);

	}

}
