/*
 *Stars.java
 *27/3/23
 *@author BSHC1A
 */

 public class Stars{
	private String input;

	 public Stars(){
		 input = " ";
	 }

	 public void setInput(String input){
		 this.input = input;
	 }

	 public void compute(){
		 for(int i = 0; i < input.length();i++){
			 System.out.print("*");
		 }
	 }

 }