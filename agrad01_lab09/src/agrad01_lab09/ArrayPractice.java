package agrad01_lab09;

import java.util.Random;

/*
 * Devansh Agrawal 
 * CS 160-04, Fall Semester 2018
 * Lab 9
 */
public class ArrayPractice {

	final int baseLength = 10;
	int[] number;
	Rectangle[] boxes;
	String[] listOfNames;

	public ArrayPractice() {
		number = new int[baseLength];
		boxes = new Rectangle[baseLength];
		for (int i = 0; i < baseLength; i++)
			boxes[i] = new Rectangle()  ;

		listOfNames = new String[baseLength];
	}

	public ArrayPractice(int numlength, int boxlength, String[] name) {
		number = new int[numlength];
		boxes = new Rectangle[boxlength];

		this.listOfNames = name;
		loadNumbers();
		loadBoxes();
	}

	public void loadNumbers() {
		Random r = new Random();
		for (int i = 0; i < number.length; i++) {
			int rand = (r.nextInt(200) - 100);
			number[i] = rand;
		}

	}

	public void loadBoxes() {

		for (int i = 0; i < boxes.length; i++) {
			boxes[i] = new Rectangle(Math.random(), Math.random());

		}
	}

	public void displayNumbers() {
		System.out.println("The numbers array is as follows:");
		for (int i = 0; i < number.length; i++) {
			System.out.printf("numbers [ %d ] has %d.\n", i, number[i]);
		}
	}

	public void displayBoxes() {
		System.out.println("\nThe boxes array is as follows:");

		for (int i = 0; i < boxes.length; i++) {

			System.out.printf("boxes [ %d ] has: \n", i);
			boxes[i].displayRectangle();
		

		}
	}

	public void displayList() {
		System.out.println("\nThe listOfNames is as follows:");
		for (int i = 0; i < listOfNames.length; i++) {
			System.out.printf("listOfNames [ %d ] has %s.\n", i, listOfNames[i]);
		}
	}

}
