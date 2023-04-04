/*
* @author Evan O'Neill
* 10/02/2023
* InterestApp.java
*/
import java.util.Scanner;
public class InterestApp {
	//psv
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);


		//loan amounts
		System.out.println("what is the total sum of money for loan");
		double loan = keyboard.nextInt();

		//amount of months
		System.out.println("what is the total of months for this loan");
		int months = keyboard.nextInt();

		//maths
		double percent = loan / 100;
		double interest = percent * 5;
		double result = interest + loan;

		// results + interest owed
		System.out.println("your total interest owed is: " + interest);
		System.out.println("your total amount is: " + result);

		}


}