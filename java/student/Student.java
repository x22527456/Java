/*
* @author Evan O'Neill
* 14/02/23
* Student.java
*
*/

public class Student{
	//data members
	private String name;
	private int id;
	private double yr1Grade, yr2Grade, avg;

	//constructors
	public Student(){
		name = "";
		//name = new String();
		id = 0;
		yr1Grade = 0.0;
		yr2Grade = avg = 0.0;
	}

	public Student(String name, int id){
		this.name = name;
		this.id = id;
		System.out.println("details entered");

		}

	//set/mutator methods - one for every input
	public void setName(String name){
		this.name = name;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setYr1Grade(double yr1Grade){
		this.yr1Grade = yr1Grade;
	}

	public void setYr2Grade(double yr2Grade){
			this.yr2Grade = yr2Grade;
	}


	//my other methods
	public void computeAvg(){
		avg = (yr1Grade + yr2Grade) / 2;
	}

	//get/accessor method - 1 for every output
	public String getName(){
		return name;

	}

	public int getId(){
		return id;
	}

	public double getYr1Grade(){
		return yr1Grade;
	}

	public double getYr2Grade(){
		return yr2Grade;
	}

	public double getAvg(){
		return avg;
	}

}