/*
* @author Evan O'Neill
* 14/03/23
* Repetition3.java
*/
import java.util.Scanner;
public class Repetition3 {
	public static void main(String args[]){
		//print 1-100
		Scanner in = new Scanner(System.in);

		int goAgain;// initialisation
		//do while
		do {

		for(int i = 1; i <=10; i = i+ 1){//initialisation; termination; progression
			System.out.println(i);//action

			}
			System.out.println("0 to exit, any number to see it again");
			goAgain = in.nextInt();

			}while (goAgain != 0);
		}
}