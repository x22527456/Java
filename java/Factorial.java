/*
*@author Evan O'Neill
*navigator domas Brazdeikis
*09/02/2023
*Factorial.java
*/
import java.util.Scanner;
public class Factorial{


	public static void main(String arg[]){

		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("enter value: ");
		 int factorial = keyboard.nextInt() ;
		 int result = factorial;
		 int x = factorial - 1;
		 while (x > 0) {
			 result *= x;
			 x--;
			 }
		System.out.println("the factorial" +result);

	 }
 }