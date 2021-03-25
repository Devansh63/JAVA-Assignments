package agrad01_lab09;

/*
 * Devansh Agrawal 
 * CS 160-04, Fall Semester 2018
 * Lab 9
 */
public class Rectangle {
	double length;
	double width;

	public Rectangle() {
		this.length = 0.0;
		width = 0.0;
	}

	public Rectangle(double len, double w) {
		length = len;
		width = w;
	}

	public Rectangle(Rectangle rectangle) {

		this.length = rectangle.length;
		width = rectangle.width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		// return the width
		return width;
	}

	public void setLength(double len) {
		if (len >= 0) {
			length = len;
		} else {
			this.length = len;
		}
	}

	public void setWidth(double width) {
		if (width >= 0) {
			this.width = width;
		} else {
			this.width = width;
		}
	}

	public double computeArea() {

		return length * width;
	}

	public double computePerimeter() {
		return (length * 2) + (width * 2);
	}

	public String toString() {
		return String.format("The length is: %.2f.\n" + "The width is: %.2f.\n", length, width);
	}

	public void displayRectangle() {

		System.out.printf(toString());
	}

	public boolean equals(Rectangle rectangle) {
		if ((length == rectangle.length) && (width == rectangle.width)) {
			return true;
		} else {
			return false;
		}
	}
}
