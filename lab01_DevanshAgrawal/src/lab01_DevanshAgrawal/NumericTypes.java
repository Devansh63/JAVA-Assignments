package lab01_DevanshAgrawal;

/**
 * Devansh Agrawal
 * CS 160-07 Fall 2018
 * 
 * Lab 1
 * 
 * go through number 1(In progress. 
 * */

import java.util.Scanner;

public class NumericTypes {
	public static void main(String[] args) {
		byte byteNumber = 127;
		short shortNumber = 127;
		int intNumber = 127;
		long longNumber = 127;
		float floatNumber = 127;
		double doubleNumber = 127;
		double ratio;
		String output = "\n\tbyteNumber = " + byteNumber + "\n\tshortNumber = " + shortNumber + "\n\tintNumber = "
				+ intNumber + "\n\tlongNumber = " + longNumber + "\n\tfloatNumber = " + floatNumber
				+ "\n\tdoubleNumber = " + doubleNumber;
		// For problem 2
		System.out.println("For problem 2(A)" + output);
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the same integer number 127 six times:");
		byteNumber = keyboardInput.nextByte();
		shortNumber = keyboardInput.nextShort();
		intNumber = keyboardInput.nextInt();
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 2(A)" + output);
		// did not recieve any error messages
		// For problem 3(A)
		intNumber = 127;
		System.out.println("Enter the integer number 127 one time:");
		intNumber = keyboardInput.nextInt();
		System.out.println("For problem 3(A)" + output);
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 3(B)" + output);
		// recieved an error for byte and short. cleared it by type convertion
		// question 2 dint show this error
		// For Problem 4(A)
		intNumber = 128;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.a)" + output);
		intNumber = -128;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.b)" + output);
		intNumber = -129;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.c)" + output);
		intNumber = 32767;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.d)" + output);
		intNumber = 32768;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.e)" + output);
		intNumber = -32768;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.f)" + output);
		intNumber = -32769;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.g)" + output);
		intNumber = 2147483647;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.h)" + output);

		intNumber = -2147483647;
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = intNumber;
		floatNumber = intNumber;
		doubleNumber = intNumber;
		System.out.println("For problem 4(A.i)" + output);
		// For prbolem 4(B)

		System.out.println("Enter the same integer number 128 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		intNumber = keyboardInput.nextInt();
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.a)" + output);

		System.out.println("Enter the same integer number -128 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.b)" + output);
		System.out.println("Enter the same integer number -129 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.c)" + output);
		System.out.println("Enter the same integer number 32767:");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.d)" + output);
		System.out.println("Enter the same integer number 32768:");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.e)" + output);
		System.out.println("Enter the same integer number -32768 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.f)" + output);
		System.out.println("Enter the same integer number -32769 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.g)" + output);
		System.out.println("Enter the same integer number 2147483647 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		System.out.println("For problem 5(B.h)" + output);
		System.out.println("Enter the same integer number 2147483647 :");
		intNumber = keyboardInput.nextInt();
		byteNumber = (byte) intNumber;
		shortNumber = (short) intNumber;
		longNumber = keyboardInput.nextLong();
		floatNumber = keyboardInput.nextFloat();
		doubleNumber = keyboardInput.nextDouble();
		// got an error while trying to enter integer into byte hence entered it into
		// byte and converted the int to byte and short
		// got an error when tried to input 2147483648 as it dint fit into the type
		// hence had to change the number
		System.out.println("For problem 5(B.i)" + output);
		floatNumber = 6;
		floatNumber = (float) 6.79;
		// no error to assign 6 floatnumber
		// error when assigning 6.79 to floatnumber needed type casting
		intNumber = 15;
		doubleNumber = 6;
		ratio = intNumber / 6;
		System.out.println(ratio);
		ratio = intNumber / doubleNumber;
		System.out.println(ratio);
		// first print of ration can not be assigned the decimal place hence displays
		// 2.0
		// second print of ration can be assigned the decimal value calculation hence
		// prints 2.5
		// For Problem 7
		System.out.println(" " + 'a' + 'b');
		System.out.println(" " + 'a' + 'b');
		System.out.println(" " + ('a' + 'b'));
		// there is no difference beteen a and b but in the 3rd part the characters are
		// turned
		// into numeric values
		// For Problem 8
		System.out.println("These are numbers:" + intNumber + doubleNumber);
		System.out.println("These are numbers:" + (intNumber + doubleNumber));
		// for the first on the value is 156 but the second on is only 21 because of the
		// brackets
		// as only the intnumber and doublenumber is operated on
		// For Problem 9
		System.out.println("Formula1:" + (25 + 5 / intNumber * doubleNumber + 1));
		System.out.println("Formula2" + ((25 + 5) / intNumber));
		// the first value has a decimal point because of the double
		// the second value has no decimal point as int is used

	}
}
