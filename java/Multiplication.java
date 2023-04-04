/*
* @author Evan O'Neill
* 14/03/23
* Multiplication.java
*/
import java.util.Scanner;
public class Multiplication{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		//declare your variables
		int num, hLong;


		System.out.println("enter number to be multiplied;");
		num = in.nextInt();

		System.out.println("enter what number to go up to;");
		hLong = in.nextInt();

		for(int i = 1; i <= hLong; i++){
			System.out.println(num+ " x " + i + " = " + (num*1));

					}



	}
}