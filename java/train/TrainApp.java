/*
*
*
*/
import java.util.Scanner;
public class TrainApp{
	public static void main(String args[]){
		String location;
		double time;
		int platform;

		//declare and create my obj
		Scanner keyboard = new Scanner(System.in);
		Train t = new Train();

		System.out.println("Enter location");
		location = keyboard.next();
		t.setLocation(location);

		System.out.println("Enter time");
		time = keyboard.nextDouble();
		t.setTime(time);

		t.compute();

		System.out.println("Your train is on platform " +t.getPlatform());
	}

}