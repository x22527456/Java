/*
* @author Evan O'Neill
* 23/02/23
* StudentAss.java
*/

public class StudentAss{
	private String Student;
	private int id;
	private double ass1, ass2, ass3, avg;


	public StudentAss(){
		Student = "";
		id = 0;
		this.ass1 = ass1;
		this.ass2 = ass2;
		this.ass3 = ass3;


	}


	public StudentAss(String name, int id){
		this.Student = name;
		this.id = id;
		System.out.println("value set");
	}

	public void setAsses(double ass1, double ass2, double ass3){
		this.ass1 = ass1;
		this.ass2 = ass2;
		this.ass3 = ass3;
	}

	public void computeAvg(){
			avg = (ass1 + ass2 + ass3 ) / 2;
		}


	public double getAss1(){
		return ass1;

	}

	public double getAss2(){
			return ass2;

		}
	public double getAss3(){
			return ass3;

		}



}