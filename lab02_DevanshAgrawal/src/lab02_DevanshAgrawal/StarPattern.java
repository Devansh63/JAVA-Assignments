package lab02_DevanshAgrawal;
import javax.swing.JOptionPane; 
import java.util.Scanner;
/*
 * Devansh Agrawal
 * CS 160-06
 * Lab 2
 */

public class StarPattern {
	public static void main(String []args)
	{
		
		System.out.println("*" + "\n" + "* * "
				   + "\n" + "* * * " + "\n" 
				   + "* * * *" + "\n" + "  * * *"
				   + "\n" + "    * *"  + "\n" 
				   + "      *");
		String pattern ="*" + "\n" + "* * "
				   + "\n" + "* * * " + "\n" 
				   + "* * * *" + "\n" + "  * * *"
				   + "\n" + "    * *"  + "\n" 
				   + "      *";
		Scanner keyboardInput = new Scanner(System.in); 
		int len = pattern.length(); 
		System.out.println("The length of the string is = " + len);
		System.out.println(pattern);
		JOptionPane.showMessageDialog(null, "The length of the string is = " + len);
		JOptionPane.showMessageDialog(null,"*" + "\n" + "* * "
				   + "\n" + "* * * " + "\n" 
				   + "* * * *" + "\n" + "  * * *"
				   + "\n" + "    * *"  + "\n" 
				   + "      *" );
		int columnum=4;		
		int asterisks= columnum*4;
		System.out.println("\n\n" + "The number of * sym"
						  + "bols in the lines of the patt"
						  + "ern are " + "\n 1, 2, 3, 4, 3,"
						  + " 2, 1," + "\nThe total number of "
						  + "* symbols in the pattern is :" +
						  asterisks);
		JOptionPane.showMessageDialog(null,"The number of * sym"
				  + "bols in the lines of the pattern are " );
		JOptionPane.showMessageDialog(null,"1, 2, 3, 4, 3, 2, 1,");
		JOptionPane.showMessageDialog(null,"The total number of "
				  + "* symbols in the pattern is :" +
				  asterisks);
		JOptionPane.showMessageDialog(null,"Check the answer?");
		String value = JOptionPane.showInputDialog("Enter number of colums for a star pattern");
		columnum = Integer.parseInt(value); 
		columnum = columnum * 4;
		JOptionPane.showMessageDialog(null,"The total number of "
								+ "* symbols in the pattern is :" +
								columnum);
		

		
		System.exit(0);
	}

}
