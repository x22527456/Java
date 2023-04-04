/*
*PrintAll.java
*
*
*/
import java.util.Scanner;
public class PrintAll{
	public static void main(String args[]){
		//declare var
		String word;
		int len;
		//declare objects
		Scanner scan = new Scanner(System.in);
		//get input from user
		System.out.println("Enter a word");
		word = scan.nextLine();
		//get the length of the word
		len = word.length();

		//for(starting point; condition for staying; jump)
		for(int i = 0; i < len; i++){
			System.out.println(word.charAt(i));
			//could check for a space and not print it - I need an IF statement
		}
	}
}