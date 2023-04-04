/*
*Train.java
*
*/
public class Train{


		//data members
		private String location;
		private int platform;
		private double time;

		//constructor
		public Train(){
			location = "";
			time = 0.0;
		}

		//set methods - 1 for each input
		public void setLocation(String location){
			this.location = location;
		}
		public void setTime(double time){
			this.time = time;
		}

		//my other methods
		public void compute(){
			if(location.equalsIgnoreCase("cork")){
				if(time <=9.00 && time <=12.00 ){
					platform = 1;
				}else if(time >12.00 && time <= 21.00){
					platform = 5;
				}
			}else if(location.equalsIgnoreCase("galway")){
				if(time <=9.00 && time <= 12.00){
					platform = 7;
				}else  if(time >12.00 && time <= 21.00){
					platform = 6;
				}
			}else if(location.equalsIgnoreCase("belfast")){
				if(time <=9.00 && time <= 12.00){
					platform = 2;
				}else  if(time >12.00 && time <= 21.00){
					platform = 1;
				}
			}

		}


		//get methods - 1 for each output
		public int getPlatform(){
			return platform;
		}

}