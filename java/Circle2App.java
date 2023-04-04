/*
* @author Evan O'Neill
* 07/02/2023
* CircleApp
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Circle2App{
	//psv
	public static void main(String args[]){
		//declare variables
		int diameter;
		double area, radius, circumference;
		final double pie = 3.14;


		//objects
		Scanner keyboard = new Scanner(System.in);

		// prompt user for input
		// System.out.println("enter the radius of circle: ");
		// accept input and save in variable radius
		// radius = keyboard.nextInt();

		// prompt user for input
		diameter = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter diameter"));


		// accept input and save in variable radius
		diameter = keyboard.nextInt();

		radius =  Integer.parseInt(JOptionPane.showInputDialog(null, diameter/2;));
		//System.out.println("radius from diameter: " + radius);

		// calculate radius
		area = (double) pie * radius * radius;

		// calculate circumference
		circumference = (double) pie * (radius+radius);

		// System.out.println("radius of circle is: " + radius);
		System.out.println("area of circle is: " + area);
		System.out.println("circumference of circle is: " + circumference);





		}


}
