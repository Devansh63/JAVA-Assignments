package project2DevanshAgrawal;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

/*
 * Devansh Agrawal
 * CS 160-07/Fall Semester 2018
 * Project 2: Examination Statistics
 * Description: 
 * 
 */
public class ExamStatistics {
	public static void main(String[] args) throws IOException {

		final int A_GRADE = 85;
		final int B_GRADE = 75;
		final int C_GRADE = 65;
		final int D_GRADE = 55;

		int totalNumberScores = 0;

		int totalNumberOfA = 0;
		int totalNumberOfB = 0;
		int totalNumberOfC = 0;
		int totalNumberOfD = 0;
		int totalNumberOfF = 0;

		int minScore = 100 ;
		int maxScore = 0;
		int nextScore = 0;

		double sumofScores = 0;
		double averageofScore = 0;
		double pstdDeviation = 0;
		String outputMessage;
		String fileName;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the file name, such as scores.txt :");
		fileName = keyboard.nextLine();

		File input_file = new File(fileName);

		while (!input_file.exists()) {
			System.out.println("\n\"" + input_file + "\" is an invalid "
					+ "file name! \nPlease reenter an existing file name, such as scores.txt:");
			fileName = keyboard.nextLine();
			input_file = new File(fileName);
		}
		Scanner reader = new Scanner(input_file);

		while (reader.hasNext()) {

			nextScore = reader.nextInt();

			if ((nextScore >= 0) && (nextScore <= 100)) {
				sumofScores += nextScore;

				totalNumberScores++;
				
				
				if (totalNumberScores == 1) 
				{
					
					
				} else if (totalNumberScores > 1) 
					{                          
						
						maxScore = Math.max(maxScore, nextScore);
						minScore = Math.min(minScore, nextScore);
					}
	
					if (nextScore >= A_GRADE)
					{
						totalNumberOfA++;
					} else if (nextScore >= B_GRADE) 
							{
								totalNumberOfB++;
							} else if (nextScore >= C_GRADE) 
									{
										totalNumberOfC++;
									} else if (nextScore >= D_GRADE) 
											{
												totalNumberOfD++;
											} else 
												{
													totalNumberOfF++;
												}
			}

		}
		averageofScore = sumofScores / totalNumberScores;
		Scanner psd_input = new Scanner(input_file);

		for (int index = 0; index < totalNumberScores; index++) {
			nextScore = psd_input.nextInt();
			if ((nextScore >= 0) && (nextScore <= 100))
			{
			pstdDeviation += Math.pow(averageofScore - nextScore, 2); 
			}
		}
		pstdDeviation=pstdDeviation/totalNumberScores;
		pstdDeviation=Math.sqrt(pstdDeviation);
		System.out.println("Exam Statistics");
		System.out.println("\nTotal:" + totalNumberScores);
		System.out.printf("Average score: %.2f", averageofScore);
		System.out.printf("\nPopulation standard deviation of the scores: %.2f",pstdDeviation);
		System.out.printf(
				"\n# of A, 85-100:  %d \t%.2f%%\n" + "# of B, 75--84:  %d \t%.2f%%\n" + "# of C, 65--74:  %d \t%.2f%%\n"
						+ "# of D, 55--64:  %d \t%.2f%%\n" + "# of F, 00--54:  %d \t%.2f%%\n",
				totalNumberOfA, ((double)totalNumberOfA / totalNumberScores) * 100, totalNumberOfB,
				((double)totalNumberOfB / totalNumberScores) * 100, totalNumberOfC, ((double)totalNumberOfC / totalNumberScores) * 100,
				totalNumberOfD, ((double)totalNumberOfD / totalNumberScores) * 100, totalNumberOfF,
				((double)totalNumberOfF / totalNumberScores) * 100);

		System.out.println("Minimum score: " + minScore);
		System.out.println("Maximum score: " + maxScore);

		FileWriter fwrite = new FileWriter(fileName, true);
		PrintWriter outputFile = new PrintWriter(fwrite);
		outputFile.println("Exam Statistics");
		outputFile.println("\nTotal:" + totalNumberScores);
		outputMessage = String.format("Average score: %.2f", averageofScore);
		outputFile.println(outputMessage);
		outputMessage= String.format("Population standard deviation of the scores: %.2f",pstdDeviation );
		outputFile.println(outputMessage);
		outputMessage=String.format("\n# of A, 85-100:  %d \t%.2f%%\n" 
								  + "# of B, 75--84:  %d \t%.2f%%\n" 
				                  + "# of C, 65--74:  %d \t%.2f%%\n"
						          + "# of D, 55--64:  %d \t%.2f%%\n" 
				                  + "# of F, 00--54:  %d \t%.2f%%\n",totalNumberOfA, 
				                  ((double)totalNumberOfA / totalNumberScores) * 100, 
				                  totalNumberOfB, ((double)totalNumberOfB / totalNumberScores) * 100, totalNumberOfC, ((double)totalNumberOfC / totalNumberScores) * 100,
						totalNumberOfD, ((double)totalNumberOfD / totalNumberScores) * 100, totalNumberOfF,
						((double)totalNumberOfF / totalNumberScores) * 100);
		
		outputFile.println(outputMessage);
		outputFile.println("Minimum score: " + minScore);
		outputFile.println("Maximum score: " + maxScore);
		outputFile.close();
		reader.close();
		psd_input.close();
		System.exit(0);
	}

}
