/*
* @author Evan O'Neill (driver)
* @author Domas Brazdeikis
* 02/02/2023
* Studen.java
*/
import java.util.Scanner;
public class Student{
	//psv
	public static void main(String arg[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("enter a number of students");
		int Students = keyboard.nextInt();

		int Teams = Students / 5;

		System.out.println("you can have " + Teams " of 5");



		}

	}