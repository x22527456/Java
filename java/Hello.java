/*
* @author Evan O'Neill
* 07/02/2023
* Hello.java
*/

import javax.swing.JOptionPane; // import swing package
public class Hello{
	//main
	public static void main(String args[]){
		int diamater;

		JOptionPane.showMessageDialog(null, "hello world");
		String name;
		name = JOptionPane.showInputDialog(null, "Enter Name: ");

		JOptionPane.showMessageDialog(null, "hello " + name);

		//diamater = JOptionPane.showInputDialog(null, "Enter Diameter: " );

		diamater = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Diameter: " ) );



	}


}