package lab03_DevanshAgrawal;

import javax.swing.JOptionPane;
import java.util.Scanner;
/*
 * Devansh Agrawal
 * CS 160-07 Fall 2018
 * Lab 3
 * checked lab 3 this is the the process of checking lab 3 in prgress. 
 * time 11: 57 date is may 7th 
 * this was funn y
 * thinking of writing a code that makes me writing a record of the day of the day and save it as date file. take reference from lab 10 
 * i think. lets see. remeber to text aneesh 
 * no wait i think the best idea is to make a to do list fro each day save it to the desktop. if not possible transfer wach file from the workspace.  
 * i dont evne know what im writing now this is pure shit and time pass the fuck m i doing m i 
 * 

 * 
 */

public class IO_Practice1 {
	public static void main(String []args)
	{
		int numberOfBooks,rnumberOfBooks=0 ,titleLength, yearPublisher ;					//Declaration of all variable
		double unitPrice, runitPrice=0.0,rtotalCost = 0.0, totalCost;
		String authorName, bookTitle, publisher, edition, firstName,middleName, lastName;
		char middleInitial;
		String cfirstName, cmiddleName, clastName,streetAddress, cityName, stateName, zipCode;
		
		Scanner keyboard = new Scanner(System.in);								//scanner class to get input
		
		System.out.println("Number of books ordered? ");										//Getting the number of books 	
		numberOfBooks = keyboard.nextInt();
		
		System.out.println("Unit price of the book? ");								//getting the price of the book
		unitPrice = keyboard.nextDouble();
		totalCost = numberOfBooks*unitPrice;
		
		System.out.println("Enter your first name, middle name and last name: ");     //information about the client
		cfirstName = keyboard.next();
		cmiddleName = keyboard.next();
		clastName = keyboard.next();
		keyboard.nextLine();
		clastName= clastName.toUpperCase();
		
		System.out.println("Enter your street address(i.e., nos and street):");				
		streetAddress = keyboard.nextLine();
		
		System.out.println("Enter name of the city:");
		cityName = keyboard.nextLine();
		
		System.out.println("Enter name of the state:");
		stateName = keyboard.nextLine();
		
		System.out.println("Enter the Zip Code: ");
		zipCode = keyboard.nextLine();
		
		System.out.println("Enter your favourite author first name, middle name and lastname: ");			// Information about the author 
		firstName = keyboard.next();
		middleName = keyboard.next();
		lastName = keyboard.next();
		middleInitial = middleName.charAt(0);
		lastName = lastName.toUpperCase();
		keyboard.nextLine();
		
		authorName = lastName + "'" + firstName + " " + middleInitial;								// Arranging the authors name into ptoper format 
		
		System.out.println("Title of your favorite book: ");
		bookTitle = keyboard.nextLine().toUpperCase();
		
		System.out.println("Enter the name of the publisher for the book: ");						//Information about the book
		publisher = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the edition for the book:");
		edition = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the year for publishing the book :");
		yearPublisher = keyboard.nextInt();
		
		 int yesNo = JOptionPane.showConfirmDialog(null,"Do you want to reorder the book?\n Yes or NO ","Question? ",JOptionPane.YES_NO_OPTION);			//Giving option to reorder book 
		 	
		 if (yesNo == 0)
		{
			rnumberOfBooks = Integer.parseInt(JOptionPane.showInputDialog(null,"Number of books ordered?",JOptionPane.QUESTION_MESSAGE));
			runitPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Unit price of the book? ",JOptionPane.QUESTION_MESSAGE));
			rtotalCost = rnumberOfBooks*runitPrice;
		}
		
		System.out.println("Information about your Favorite Book:");									//Displaying of variable
		System.out.println("My favourite author is:\n\t" + authorName); 
		System.out.println("My favorite book from" + firstName + "is\n\t" + bookTitle );
		System.out.printf("\t%s, %s Edition , %d\n",publisher,edition,yearPublisher);
		titleLength=bookTitle.length();
		
		System.out.println("The length of the title is:" + titleLength);
		int age = 2018-yearPublisher;																//checking how old the book is 
		if(age<=1)
			{
			System.out.println("This is a year old book");
			}
		else
			{
				System.out.println("It is a " + age + " years old book.");
			}
		
		System.out.printf("\nThe total cost of %d book of the unit price $%f is %f from the %s Publisher\n",
				numberOfBooks,unitPrice,totalCost,publisher);
		
		System.out.println("\nInformation about Customer:");
		System.out.println("Name: " + cfirstName + " " + cmiddleName + " " + clastName );								//Displaying information about the client 
		System.out.println("Street Address: " + streetAddress); 
		System.out.println("City: " + cityName);
		System.out.println("State: \t" + stateName);
		System.out.println("ZipCode:  " + zipCode );                                                       

		if(yesNo==0)
			{
			 System.out.printf("\nThe total cost of %d book of the unit price $%.2f is %.2f from the %s Publisher\n",							//Displaying the number of reordered books
					rnumberOfBooks,runitPrice,rtotalCost,publisher);
			}
		System.out.println("\nThe end of the invoice");								


		System.exit(0);
				
		
	}
	
}	

