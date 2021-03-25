package lab04_DevanshAgrawal;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class RomanNumerals {
/*
 * Devansh Agrawal
 * CS 160-07 Fall 2018 
 * Lab 4
 * 
 */
	public static void main(String []args)
	{
		int decimal=0;
		String roman, title, task;
		int yesNo;
		
			
		do
		{	
			title="Conversion of Roman numeral";
			task="Enter a Roman numeral betweeen \"I\" and \"XV\"";
			roman = JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE);
			roman=roman.toUpperCase();
			if(roman.charAt(0) == 'I')
			{
				if(roman.equals("I"))
				{   
					decimal=1;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("II"))
				{	
	
					decimal=2;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("III"))
				{   
					decimal=3;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("IV"))
				{   
					decimal=4;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("IX"))
				{   
					decimal=9;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	else 
				{
					task="input " + roman + " is not an \n admissible Roman numeral";
					JOptionPane.showMessageDialog(null, task, title, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(roman.charAt(0) == 'V')
			{
				if(roman.equals("V"))
				{   
					decimal=5;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("VI"))
				{   
					decimal=6;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("VII"))
				{   
					decimal=7;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
				else if(roman.equals("VIII"))
				{   
					decimal=8;
					task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
					JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
				}else 
				{
					task="input " + roman + " is not an \n admissible Roman numeral";
					JOptionPane.showMessageDialog(null, task, title, JOptionPane.INFORMATION_MESSAGE);
				}	
			}
			else if(roman.charAt(0)=='X')
				{
					if(roman.equals("X"))
					{   
						decimal=10;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else if(roman.equals("XI"))
					{   
						decimal=11;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else if(roman.equals("XII"))
					{   
						decimal=12;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else if(roman.equals("XIII"))
					{   
						decimal=13;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else if(roman.equals("XIV"))
					{   
						decimal=14;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else if(roman.equals("XV"))
					{   
						decimal=15;
						task="The decimal value for the Roman numeral \"" + roman + "\" is:\n ……"+decimal+"……" ;
						JOptionPane.showMessageDialog(null,task, title, JOptionPane.INFORMATION_MESSAGE);
					}	
					else 
					{
						task="input " + roman + " is not an \n admissible Roman numeral";
						JOptionPane.showMessageDialog(null, task, title, JOptionPane.INFORMATION_MESSAGE);
					}
				}else 
				{
					task="input " + roman + " is not an \n admissible Roman numeral";
					JOptionPane.showMessageDialog(null, task, title, JOptionPane.INFORMATION_MESSAGE);
				}
		
			 yesNo = JOptionPane.showConfirmDialog(null, "Any more Roman Numerals? \nyes or no", title,JOptionPane.YES_NO_OPTION);
		}while(yesNo==0);
			
		JOptionPane.showMessageDialog(null,"End of Program!", title, JOptionPane.INFORMATION_MESSAGE);
			
	
		
	System.exit(0);
	}


}
