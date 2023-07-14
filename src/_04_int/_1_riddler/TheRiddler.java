package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Answer1 = ("A needle");
		String Response = JOptionPane.showInputDialog("What has an eye but cannot see?");
		if (Response.equals(Answer1)) {
			JOptionPane.showMessageDialog(null, ("Correct!"));
			score += 1;}
			
		else{ JOptionPane.showMessageDialog(null, ("Wrong"));

		}	

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer
		String Answer2 = ("A priest");
		String Response1 = JOptionPane.showInputDialog("He has married many women, but has never been married. Who is he?");
		if (Response1.equals(Answer2)) {
			JOptionPane.showMessageDialog(null, ("Correct!"));
			score += 1;}
			
		else{ JOptionPane.showMessageDialog(null, ("Wrong"));

		}	

		// 6. Add some more riddles
		String Answer3 = ("The letter W");
		String Response2 = JOptionPane.showInputDialog("What is at the end of a rainbow?");
		if (Response2.equals(Answer3)) {
			JOptionPane.showMessageDialog(null, ("Correct!"));
			score += 1;}
			
		else{ JOptionPane.showMessageDialog(null, ("Wrong"));

		}	

		// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, "Score: "+ score);
	
}
}

