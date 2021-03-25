package agrad01_lab08;

import java.util.Scanner;

/*
 * Devansh Agrawal 
 * CS 160-04, Fall Semester 2018
 * Lab 8
 */
public class Apllications {
	
public static void main(String[] args) {
		double rLength;
		double rWidth;
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the length of a the rectangle: ");
		rLength = keyboardInput.nextDouble();
		System.out.println("Enter the width of a the rectangle: ");
		rWidth = keyboardInput.nextDouble();
		
		Rectangle box = new Rectangle(rLength, rWidth);
		
		Rectangle box2 = new Rectangle();
		box2.setLength(15.0);
		box2.setWidth(30.0);
		
		box.displayRectangle();
		box2.displayRectangle();
		
		System.out.println("The statement that \"box one and box two are equal\" is " + 
		                   box.equals(box2));
		
		Rectangle box3 = new Rectangle();
		
		double bLength = box.getLength();
		double bWidth = box.getWidth();
		
		box3.setLength(bLength);
		box3.setWidth(bWidth);
		
		System.out.println("The statement that \"box one and three are equal\" is " + 
               							 box.equals(box3));
		
		String str = "\nThe area of %s is %.2f; and " + 
		             	     "\nits perimeter is %.2f\n";
		
		System.out.printf(str, "box one", box.computeArea(), box.computePerimeter());
		box.displayRectangle();
		
		System.out.printf(str, "box two", box2.computeArea(), box2.computePerimeter());
		box2.displayRectangle();
		
		System.out.printf(str, "box three", box3.computeArea(), box3.computePerimeter());
		box3.displayRectangle();
		
	}
}
/*
 * Enter the length of a the rectangle: 
15
Enter the width of a the rectangle: 
30
The length is: 15.00.
The width is: 30.00.
The length is: 15.00.
The width is: 30.00.
The statement that "box one and box two are equal" is true
The statement that "box one and three are equal" is true

The area of box one is 450.00; and 
its perimeter is 90.00
The length is: 15.00.
The width is: 30.00.

The area of box two is 450.00; and 
its perimeter is 90.00
The length is: 15.00.
The width is: 30.00.

The area of box three is 450.00; and 
its perimeter is 90.00
The length is: 15.00.
The width is: 30.00.

 */

 