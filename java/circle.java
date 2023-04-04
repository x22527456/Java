/*
* @author Evan O'Neill
* 31/01/2023
* Circle.java
*/
import java.util.Scanner;
public class Circle{
	//psv
	public static void main(String args[]){
		Scanner keyboard;

		keyboard = new Scanner(System.in);
		int radius;
		double result;

		System.out.println("enter radius: ");
		radius = keyboard.nextInt();

		// process
		result = 3.14*(radius * radius);

		System.out.println("the area of this circle is " + result);

		}

}