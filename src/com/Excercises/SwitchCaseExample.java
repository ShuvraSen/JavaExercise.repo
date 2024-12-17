package com.Excercises;

public class SwitchCaseExample {

	public static void main(String[] args) {
	/* syntax
	 * switch(variable){
	 * case value1:statement;
	 * case value2:statement;
	 * case value3:statement;
	 * case value4:statement;
	 * case value5:statement;
	 * default:statement
	 * }
	 * 
	 */
		
//		String planet="earth";
//		switch (planet) {
//		case "mercury":{
//			System.out.println("ist");
//			break;
//		}	
//		case "earth":{
//			System.out.println("2snd");
//			break;
//		}
//
//		default:
//			System.out.println("none");
//			
//		}
		String day="Saturday";
		switch (day) {
		case "friday":
			System.out.println("weekday");
			System.out.println("work");
			break;
		
		case "Saturday":
			int dayNumber=7;
			System.out.println("weekend" + dayNumber);
			System.out.println("fun");
			break;
		
		
		default:
			System.out.println("none");
			break;
		}
	}

}
