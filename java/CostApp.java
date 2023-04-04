/*
* @author Evan O'Neill
* 03/02/2023
* CostApp.java
*/

import java.util.Scanner;
public class CostApp{
	//psv
	public static void main(String args[]){
		// declare vars
		int numPeople, numNights;
		double totalCost;

		// declare and creat objects
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		// get user data
		System.out.println("Enter number of nights: ");
		numNights = keyboard.nextInt();

		System.out.println("Enter number of people: ");
		numPeople = keyboard.nextInt();

		// proccess
		totalCost = (numNights * numPeople) * 60;


		// display
		System.out.println("your total is: $" + totalCost);

	}


}