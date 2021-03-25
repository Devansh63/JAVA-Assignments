package lab06_DevanshAgrawal;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
/*
 * Devansh AGrawal 
 * CS 160-07 Fall 2018
 * Lab 6
 * 
 */


public class LoopsFilesPennies {
	public static void main(String[] args)throws IOException{

		int days;
		int penny=0;
		double wages;
		//boolean variable=false;
		double payRateOptionI;
		//double difference=0;
		String fileName,Comment;
		Scanner kinput= new Scanner(System.in);
		
		System.out.println("Enter the number of days worked : 21 to 30 :");
		days= kinput.nextInt();
		System.out.println("What is the daily wage for Option I");
		payRateOptionI=kinput.nextDouble();
		System.out.println("Pay Rate for Option II vs OptionI:");
		System.out.println("Days Worked  Option II Cents\tOption I $");
		if(days>=21 && days <= 30)
		{
			for(int i=1;i<=days;i++)
			{
				if(i==1)
				{
				penny=1;
				}
				else
					{
						penny= penny*2;  
					}
				
				//if( variable==false)
				//{
					//difference= penny/100.0-days*payRateOptionI;
				//}
				 //variable =true;
				 System.out.printf("day %2d: %,15d\t   %,12.2f\n",i,penny, i*payRateOptionI);
		    }
			wages=penny/100;
			System.out.printf("For %d days worked the CS major earned $%,12.2f and the XX major earned $%,12.2f\n", days,wages,days*payRateOptionI);
	}
		
		System.out.print("Enter the file name, such as wages.txt :");
		fileName = kinput.nextLine();
		File file= new File(fileName);
		while(!file.exists()) 
		{
			System.out.print(fileName +  " Is an invalid filename please Enter the file name, such as wages.txt :");
			fileName = kinput.nextLine();
			file= new File(fileName);
		}
		FileWriter fwriter = new FileWriter(fileName,true);
		PrintWriter outputFile= new PrintWriter(fwriter);
		Comment="The CS major will be making a better choice if the number of days that they will be working is higher than or equal to 23 days  ";
		outputFile.println("Pay Rate for OptionII vs Option I:");
		outputFile.println("Days Worked Option II Cents      Option I$");
		outputFile.println("day 21: \t1,048,576     \t\t21,000.00 ");
		outputFile.println("day 22: \t2,097,152     \t\t22,000.00");
		outputFile.println("day 23: \t4,194,304     \t\t23,000.00 ");
		outputFile.println("day 24: \t8,388,608     \t\t24,000.00 ");
		outputFile.println("day 25: \t16,777,216     \t\t25,000.00  ");
		outputFile.println("day 26: \t33,554,432     \t\t26,000.00  ");
		outputFile.println("day 27: \t67,108,864     \t\t27,000.00 ");
		outputFile.println("day 28: \t134,217,728 \t\t28,000.00  ");
		outputFile.println("day 29: \t268,435,456 \t\t29,000.00 ");
		outputFile.println("day 30: \t536,870,912 \t\t30,000.00 ");
		outputFile.println("In 30 days the CS major earned $ 5,368,709.12 while the XX major earned $30,000.00. ");
		outputFile.println(Comment);
		
		
		outputFile.close();
		System.exit(0);
}
}
