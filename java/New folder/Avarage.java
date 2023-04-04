/*
* @author Evan O'Neill
* 23/02/23
* Avarage.java
*/

public class Avarage{
	private double avg, ass1, ass2, ass3;

	StudentAss info = new StudentAss();

	public double avg(){
		this.ass1 = info.getAss1();
		this.ass2 = info.getAss2();
		this.ass3 = info.getAss3();
		this.avg = (ass1 + ass2 + ass3) / 3;
		return avg;

	}



}