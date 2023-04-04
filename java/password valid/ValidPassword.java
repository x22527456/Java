/*
*ValidPassword.java
*check for length, a number, a character
*
*to do: add a better user message
*create an instantiable class with methods to check for each of these
*/
import java.util.Scanner;
public class ValidPassword{
	//main()
	public static void main(String args[]){
		//declare var
		String pword;
		boolean validLen, validNum, validChar;

		//declare & create obj
		Scanner input = new Scanner(System.in);

		do{
			System.out.println("Password must have 6 characters, *@ or ? and 1, 2 or 3");
			pword = input.next();

			int len = pword.length();
			if(pword.length() > 5){ //valid
				validLen = true;
			}else{ //or not
				validLen = false;
			}

			//check if it contains a number 1, 2 or 3
			validNum = false;
			if(validLen){
				for(int i = 0; i < pword.length(); i++){
					if(pword.charAt(i) == '1' || pword.charAt(i) == '2' || pword.charAt(i)=='3' ){
						validNum = true;
					}
				}
			}

			//check if it contains * @ ?
			validChar = false; //initialised
			if(validLen){
				for(int i = 0; i < pword.length(); i++){
					if(pword.charAt(i) == '*' || pword.charAt(i) == '?' || pword.charAt(i) == '@'){
						validChar = true;
					}
				}
			}

			if(validLen && validNum && validChar){
				//if evaluates to true then it executes code below & print *
				for(int i = 0; i < pword.length(); i++){
					System.out.print("*");
				}
			}else if(!validLen || !validNum || !validChar){
				System.out.println("Invalid password");
			}
			System.out.println("");

		}while(!validLen || !validNum || !validChar);

		System.out.println("Done");
	}
}