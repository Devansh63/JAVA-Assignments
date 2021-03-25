package lab05_DevanshAgrawal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Order3Strings {

	/*
	 * Devansh Agrawal CS 160-07 Fall 2018 Lab 5
	 * 
	 */
	public static void main(String[] args) {
		int yesNo;
		int countChar = 0;
		int numberWords = 0;

		String names = null;
		String name1, name2, name3;
		String namesOrdered;
		

		boolean invalid_names = false;

		final String title = "3 Strings Comparison";
		String title1, task;

		task = "Do you want to compare strings?";
		yesNo = JOptionPane.showConfirmDialog(null, task, title, JOptionPane.YES_NO_OPTION);

		if (yesNo == JOptionPane.YES_OPTION) {

			while (yesNo == JOptionPane.YES_OPTION) {

				names = JOptionPane.showInputDialog(null, "Enter 3 names with blank(s) in between:",
						"Welcome to the name ordering program", JOptionPane.QUESTION_MESSAGE);
				

				
				if ((names.equals("null")) || (names.equals(""))) {
					invalid_names = true;
				} else {
					countChar = 0;
					numberWords = 0;
				
					for ( ; ((countChar < names.length()) && (names.charAt(countChar) == ' ') ); 
							countChar++ )
					{
						
					}
					
					
					while (countChar < names.length()) // (countChar < names.length() - 1)
					{

						// Continue to scan through non-blank characters until hit a blank.
						// Then increase numberWords by one.
						for (; countChar < names.length() && names.charAt(countChar) != ' '; countChar++) 
						{
							
						}
						numberWords++;
						
						for ( ; countChar < names.length() && names.charAt(countChar) == ' '; 
								countChar++ )
						{
							
						}
						


		}
	
		
		
	}
						if (invalid_names || numberWords < 3) {

							task = "This program terminates for invalid input.";
							System.out.println("\n" + task);
							JOptionPane.showMessageDialog(null, task, title, JOptionPane.WARNING_MESSAGE);

							System.exit(0);

						}
						Scanner splitter = new Scanner(names);
						name1 = splitter.next();
						name2 = splitter.next();
						name3 = splitter.next();
						 
						
						name1 = name1.toLowerCase();
						char firstChar = Character.toUpperCase(name1.charAt(0));
						String substr = name1.substring(1);
						name1 = firstChar + substr;

						name2 = name2.toLowerCase();
						firstChar = Character.toUpperCase(name2.charAt(0));
						substr = name2.substring(1);
						name2 = firstChar + substr;

						name3 = name3.toLowerCase();
						firstChar = Character.toUpperCase(name3.charAt(0));
						substr = name3.substring(1);
						name3 = firstChar + substr;
						
						namesOrdered = sortWords(name1, name2, name3);

						task = String.format("X3: The names in lexicographic order are \n%s.\n", namesOrdered);
						title1 = "The names in order";
						System.out.print(task);
						JOptionPane.showMessageDialog(null, task, title1, JOptionPane.INFORMATION_MESSAGE);
						

						task = "Do you want to continue string comparison?";
						yesNo = JOptionPane.showConfirmDialog(null, task, title, 
																JOptionPane.YES_NO_OPTION);
						
						System.out.println("\n");
					}
				}
				if (yesNo == JOptionPane.NO_OPTION)
				{
					
					//Prompty "No" for do not want to compare strings 
					task = "The program terminates!\n" + 
							 "End of this program."; 
					System.out.println(task);
					JOptionPane.showMessageDialog(null, task, title, 
												 JOptionPane.WARNING_MESSAGE);
				}
				
				System.exit(0);

			
		}
						
			
		

	

	public static String sortWords(String w1, String w2, String w3) {
		String wio1, wio2, wio3;
		int w1_w2, w2_w3, w1_w3;
		// sort three words in alpabetical order.
		wio1 = w3;
		wio2 = w3;
		wio3 = w3;

		w1_w2 = w1.compareToIgnoreCase(w2);
		w1_w3 = w1.compareToIgnoreCase(w3);
		w2_w3 = w2.compareToIgnoreCase(w3);


		if (w1_w2 == 0) { // w1 = w2;
			if (w1_w3 == 0) { // w1 = w3; case 1
				wio1 = w1;
				wio2 = w2;
				wio3 = w3;
			} else {
				if (w1_w3 < 0)

				// w1 < w3 ; case 2
				{
					wio1 = w1;
					wio2 = w2;
					wio3 = w3;
				} else { // w1 > w3; case 3
					wio1 = w3;
					wio2 = w1;
					wio3 = w2;
				}
			}
		} else {
			if (w1_w2 < 0) {// w1< w2
				if (w2_w3 == 0) { // w2 = w3; case 5
					wio1 = w1;
					wio2 = w2;
					wio3 = w3;
				} else {
					// w2 != w3
					if (w2_w3 < 0) { // w2 < w3 //case 8
						wio1 = w1;
						wio2 = w2;
						wio3 = w3;
					} else {
						// w2 > w3
						if (w1_w3 == 0) {
							// w1 = w3 //case 6
							wio1 = w1;
							wio2 = w3;
							wio3 = w2;
						} else {
							// w1 != w3
							if (w1_w3 < 0) {
								// w1 < w3; case 9
								wio1 = w1;
								wio2 = w3;
								wio3 = w2;
							} else {
								// w1 > w3; case 10
								wio1 = w3;
								wio2 = w1;
								wio3 = w2;
							}
						}
					}

				}
			} else {
				// w2 < w1
				if (w2_w3 == 0) {
					// w2 = w3; case 4
					wio1 = w2;
					wio2 = w3;
					wio3 = w1;
				} else {
					// w2 != w3
					if (w2_w3 < 0) {
						// w2 < w3;
						if (w1_w3 == 0) {
							// w1 = w3;case 7
							wio1 = w2;
							wio2 = w1;
							wio3 = w3;
						} else {
							// w1 != w3;
							if (w1_w3 < 0) {
								// w1 < w3; case 13
								wio1 = w2;
								wio2 = w1;
								wio3 = w3;
							} else {
								// w1 > w3; case 12
								wio1 = w2;
								wio2 = w3;
								wio3 = w1;
							}
						}
					} else { // w2 > w3; case 11.
						wio1 = w3;
						wio2 = w2;
						wio3 = w1;
					}
				}

			}

		}

		String orderedNames = wio1 + " " + wio2 + " " + wio3;

		return orderedNames;

	}

	}
