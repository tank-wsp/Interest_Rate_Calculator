/**A program that calculates the interest rate on the next payment
 * Problem 2.20 in text- Ashley Clark 4/30/2019
 */

import java.util.Scanner;
public class calculateInterestRate {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	//import Scanner
	System.out.println("Enter the balance: ");
	System.out.println("Enter the annual interest rate: ");
	double balance = input.nextDouble();
	double annualInterestRate= input.nextDouble();
	 
	 double interest = balance *(annualInterestRate/1200); //calculates the interest rate
	 
	 System.out.println("Your interest rate is: " + interest); // prints the interest rate to the user

	}

}
