/*
 * Alexander Thompson
 * Assignment 05
 * Description: Football Score trasnlation
 * Due date: October 3rd at 8 am
 * thomp2aj@mail.uc.edu
 */
package footballFun;

public class FootballFun {
/***
 * Check the correct count of the translated score
 * @param args
 */
	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	
	/***
	 * Translate score into a string
	 * @param score
	 * @return String of described score
	 */
	public static String translateScore (int score) { 
		//Method that takes the score and returns and returns a string describing it
		
		
		if (score == 2) return ("safety"); //2 points is a safety
		
		else if (score == 3) return ("field goal"); //3 points is a field goal
		else if (score == 6) return ("touchdown"); //6 points is a touchdown
		else if (score == 7) return ("touchdown and extra point"); //7 points is a td + Extra Point
		else if (score == 8) return ("touchdown and 2-point conversion"); //8 is td + 2 point Conversion
		else if (score == -1) return (""); //-1 Score
		else if (score == 1) return ("invalid"); //Can't score 1 in football
		else if (score == 10) return ("you must be playing Quidditch "); //Can't score 10 in one drive
		return "";
	}
}
