/*
* @author Evan O'Neill
* 23/02/23
* StudentAssApp.java
*/
import javax.swing.JOptionPane;
public class StudentAssApp{
	public static void main(String args[]){
		String name = JOptionPane.showInputDialog(null, "enter name: ");
		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "enter Id: ") );

		StudentAss info = new StudentAss(name, id);

		Avarage avg = new Avarage();

		double ass1 = Double.parseDouble(JOptionPane.showInputDialog(null, "enter Assingment 1: ") );
		double ass2 = Double.parseDouble(JOptionPane.showInputDialog(null, "enter Assingment 2: ") );
		double ass3 = Double.parseDouble(JOptionPane.showInputDialog(null, "enter Assingment 3: ") );

		info.setAsses(ass1, ass2, ass3);
		JOptionPane.showMessageDialog(null, "avarage: " + avg.avg());

		}


	}
