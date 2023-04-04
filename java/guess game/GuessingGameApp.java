/*
* @author Evan O'Neill
* 03/03/2023
* GuessingGameApp.java
*/
import javax.swing.JOptionPane;
public class GuessingGameApp{
	public static void main(String args[]){
		String output;
		int guess, secret;

		GuessingGame p1;

		secret = Integer.parseInt(JOptionPane.showInputDialog(null, "enter Secret number: "));


		p1 = new GuessingGame(int secret);

		p2 = new GuessingGame(int guess);
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "enter Guess: "));

		JOptionPane.showMessageDialog(null, "getting secret" + getOutput());





		}
}