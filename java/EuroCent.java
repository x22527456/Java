/*
*navigator Evan O'Neill
*driver Domas brazdeikis
*09/02/2023
*EuroCent.java
*/
import java.util.Scanner;
public class EuroCent{


	public static void main(String arg[]){

		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("enter cents:");
		 int amount = keyboard.nextInt();
		 int euro = amount/100;
		 int cents = amount - euro * 100;

		 System.out.println("your amount is:" + euro + " euro " + cents + " cents ");


		}


	}
