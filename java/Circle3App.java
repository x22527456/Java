/*2
* @author Evan O'Neill
* 09/02/2023
* Circle3App.java
*/

import javax.swing.JOptionPane;
public class Circle3App{

	//psv
		public static void main(String args[]){
			//declare variables
			int diameter;
			double area, radius, circumference;
			final double pie = 3.14;

			//diameter
			diameter = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter diameter"));


			//radius

			radius = diameter/2;
			JOptionPane.showInputDialog(null, "your radius is: " + radius);

			//area
			area = (double) pie * radius * radius;
			JOptionPane.showMessageDialog(null, "your area is: " + area);


			// circumference
			circumference = (double) pie * (radius+radius);
			JOptionPane.showInputDialog(null, "your circumference is: " + circumference);


	}


}