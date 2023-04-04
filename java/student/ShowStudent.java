/*
* @author Evan O'Neill
* 14/02/23
* ShowStudent.java
*
*/

public class ShowStudent{
	//main metheod
	public static void main(String args[]){
		String name = "sam";
		int id = 5;
		double yr1Grade = 70;
		double yr2Grade = 55.5;
		double avg;

		//declare and create my object
		Student myStudent;
		myStudent = new Student();

		myStudent.setYr1Grade(yr1Grade); //send ober data from Student.java
		myStudent.setYr2Grade(yr2Grade);

		myStudent.computeAvg(); //do the processing


		avg = myStudent.getAvg();// get back data from student class

		System.out.println("avg grade: " + avg);// display output
		//System.out.println("avg grade: " + myStudent.getAvg());


		//2nd set of grades set over to student obj
		myStudent.setYr1Grade(46.5);
		myStudent.setYr2Grade(65.4);
		myStudent.computeAvg();
		System.out.println("avg grade: " + myStudent.getAvg());

	}

}