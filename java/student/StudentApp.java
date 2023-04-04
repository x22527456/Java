/*
* StudentApp
*
*
*/
import javax.swing.JOptionPane;
public class StudentApp{
	//main
	public static void main(String args[]){
		String name;
		int id;

		Student s1;
		Student s2;

		name = JOptionPane.showInputDialog(null, "Name: ");
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "id: "));

		s1 = new Student(name, id);

		s2 = new Student();
		s2.setName(JOptionPane.showInputDialog(null, "name s2: "));
		s2.setId( Integer.parseInt(JOptionPane.showInputDialog(null, "id s2: ")) );

		JOptionPane.showMessageDialog(null, "s1 details: " + s1.getName() );
		JOptionPane.showMessageDialog(null, "s2 details: " + s2.getName() );


	}

}