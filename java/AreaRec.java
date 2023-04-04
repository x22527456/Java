/*
* @author Evan O'Neill
* 31/01/23
* AreaRec.java
*/
import java.util.Scanner; //import the scanner class
public class AreaRec{
	//psv
	public static void main(String args[]) {
		// declare the class and give it an obj variable
		Scanner keyboard;
		//create
		keyboard = new Scanner(System.in);

		// declare a var
		int length;
		int breadth;
		int area;


		System.out.println("enter length");
		length = keyboard.nextInt();

		System.out.println("enter breadth");
		breadth = keyboard.nextInt();

		// process
		area = breadth * length;

		System.out.println("area = " + area);
	}
}