/*
*@author Evan O'Neill
*navigator Domas brazdeikis
*09/02/2023
*BusTicket.java
*/
import java.util.Scanner;
public class BusTicket{
	//psv
	public static void main(String args[]){

		int adult = 3 ;
		int child = 2 ;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("how many adult tickets would you like :");
		int amount1 = keyboard.nextInt();

		System.out.println("how many child tickets would you like:");
		int amount2 = keyboard.nextInt();

		int result1 = adult * amount1;
		int result2 = child * amount2;
		int result3 = result1 + result2;

		System.out.println("your total amount is " + result3);



		}


	}