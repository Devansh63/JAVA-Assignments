package lab07_DevanshAgrawal;

import java.awt.Color;
import javax.swing.*;
import java.util.Random;

public class ESPGame {
private String chosenColor;
	
	public Color chooseColor(int input) {
	
		Color color;
		
		switch (input) {
		
			case 1:
				color = Color.BLUE;
				chosenColor = "blue";
				break;
			case 2:
				color = Color.YELLOW;
				chosenColor = "yellow";
				break;
			case 3:
				color = Color.RED;
				chosenColor = "red";
				break;
			case 4:
				color = Color.GREEN;
				chosenColor = "green";
				break;
			case 5:
				color = Color.ORANGE;
				chosenColor = "orange";
				break;
					
			default:
				color = Color.BLACK;
				chosenColor = "black";
				break;
		}
		
		return color;
		
	}
	
	public void showColor(Color color) {
		

		JFrame frame = new JFrame("Guess this color");
		frame.setSize(450,450);		
		frame.setLocation(350,350);
		JPanel panel = new JPanel();
		panel.setBackground(color);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void guessColor() {
		
		int totalGamePlayed = 0;	
		int totalCorrectGame = 0;	
		
		int yesNo = JOptionPane.showConfirmDialog(null, "Enter the ESP Game?", "ESP Game", 
					JOptionPane.YES_NO_OPTION);
		
		while (yesNo == JOptionPane.YES_OPTION)
		{
			
			for(int i=0;i<10;i++) {
				Random rand = new Random();
				int num = rand.nextInt(5) + 1;
				showColor(chooseColor(num));
				String str01 = "type the name of the color that you want to guess:"  
			+"\nred\ngreen\nblue\norange\nyellow";
		     
			String user_input = JOptionPane.showInputDialog(null,str01,"Color list",JOptionPane.QUESTION_MESSAGE );
				
				
				
				
				
				
				if (user_input != null)
				{

					if(user_input.equals(chosenColor)) {
						
						JOptionPane.showMessageDialog(null, "You guessed correct", "Your guess is", 
												        JOptionPane.INFORMATION_MESSAGE);
						++totalGamePlayed;			
						++totalCorrectGame;	
				
					}
					else {
							
							JOptionPane.showMessageDialog(null, "You guessed wrong", "Your guess is", 
													    JOptionPane.WARNING_MESSAGE);
							++totalGamePlayed;			
						}
			
				} 
				
				else
				{
					break;     
				}
			} 
				yesNo = JOptionPane.showConfirmDialog(null, "Enter the ESP Game?", "ESP Game", 
						JOptionPane.YES_NO_OPTION);	

			    
		}  
			
		display(totalGamePlayed, totalCorrectGame);

		System.exit(0); 
		
	} 
	

	public void display(int gamesPlayed, int correctGuess)	{
		
		String str04;
		if (gamesPlayed > 0)
		{
			str04 = String.format("Out of 10 games, you have guessed %d correct.\n" , 
									 correctGuess);
			System.out.println(str04);
		}
		else
			{
				System.out.println("No game was played."); 
				str04 = "No game was played.";
			}
		JOptionPane.showMessageDialog(null, str04, "Your ESP Test Result: ", JOptionPane.INFORMATION_MESSAGE);
		
	}
		
} 
