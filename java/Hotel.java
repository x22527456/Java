/*
* @author Evan O'Neill (driver)
* @author Domas Brazdeikis
* 02/02/2023
* Hotel.java
*/
import java.util.Scanner;
public class Hotel{
	//psv
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("enter number of people");
		int people = keyboard.nextInt();

		System.out.println("enter number of nights");
		int nights = keyboard.nextInt();

		int result = people*60 + nights*60;
		System.out.println("$" + result);

		}


	}