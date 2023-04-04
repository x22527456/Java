/*
* @author Evan O'Neill
* 03/03/2023
* GuessingGame.java
*/
public class GuessingGame{
	private int guess, secret;
	private String output;


	public GuessingGame(){
		guess = 0;
		secret = 0;
		output = "";
		}

		public GuessingGame(int guess, int secret, String output){
		this.guess = guess;
		this.secret = secret;
		this.output = output;
		System.out.println("details entered");

		}

		public void setSecret(int secret){
			this.secret = secret;

		}

		public void setGuess(int Guess){
					this.guess = guess;

		}

		public void checkGuess(int guess){
			if (guess == secret)
			System.out.println("Perfect!");

			if (guess > secret)
			System.out.println("Too high!");

			if (guess < secret)
			System.out.println("Too low!");
			}



		public String getOutput(){
			return output;
		}

}