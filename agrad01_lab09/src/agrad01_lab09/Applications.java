package agrad01_lab09;

/*
 * Devansh Agrawal 
 * CS 160-04, Fall Semester 2018
 * Lab 9
 */
public class Applications {

	public static void main(String[] args) {

		ArrayPractice arrayPrac = new ArrayPractice();
		arrayPrac.displayNumbers();                           
		arrayPrac.displayBoxes();
		arrayPrac.displayList();
		System.out.println(" ");

		String[] name = new String[] { "Devansh", "Shreya", "Diksha", "Santosh", "Sanjay" };
		arrayPrac = new ArrayPractice(50, 6, name);
		arrayPrac.displayNumbers();
		arrayPrac.displayBoxes();
		arrayPrac.displayList();

	}

}
