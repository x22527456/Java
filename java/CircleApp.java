/*
* @author Evan O'Neill
* 07/02/2023
* CircleApp
*/
import java.util.Scanner;
public class CircleApp{
	//psv
	public static void main(String args[]){
		//declare variables
		int radius;
		double area, circumference;
		final double pie = 3.14;


		//objects
		Scanner keyboard = new Scanner(System.in);

		// prompt user for input
		System.out.println("enter the radius of circle: ");
		// accept input and save in variable radius
		radius = keyboard.nextInt();

		//calculate radius
		area = pie * radius * radius;

		//calculate circumference
		circumference = pie * (radius+radius);

		System.out.println("a circle of radius is: " + radius);
		System.out.println("area of circle is: " + area);
		System.out.println("circumference of circle is: " + circumference);





		}


}
