/*
* @author Evan O'Neill
* 31/01/2023
* Room2
*/
import java.util.Scanner; //import the scanner class
public class Room2{
	//psv
	public static void main(String args[]) {
		// declare the class and give it an obj variable
		Scanner keyboard;
		//create
		keyboard = new Scanner(System.in);

		// declare a var
		int length;
		int width;
		int area;


		System.out.println("enter length");
		length = keyboard.nextInt(); // taking data from user and storing in number
		// using the scanner class and the method nextInt()
		// to use the scanner i gave it an obj var name keyboard

		System.out.println("enter width");
		width = keyboard.nextInt();

		// process
		area = width * length;

		System.out.println("area = " + area);

		// test that there is data in the var number
	    //should show the data on screen!




		// declare variables for the room measurements
		//double length;
		//double width;
		//double area;
		//length = 3;
		//width = 4.5;
		//area = length * width;
		//System.out.println("area of room is " + area);
	}
}