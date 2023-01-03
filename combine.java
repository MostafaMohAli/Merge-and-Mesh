/*
 * Written by Mostafa Mohamed Ali
 * CSCE 311
 */
package homework01;

import java.io.*;
import java.util.*;

public class combine {
	public static void main(String[] args) throws IOException {

		// Scanner to get the User absolute file path
		Scanner scan = new Scanner(System.in);

		// Prompting the user to enter file
		System.out.println("Enter Questions text file path: ");
		String questionsScan = scan.nextLine();

		// Prompting the user to enter file
		System.out.println("Enter Answers text file path: ");
		String answersScan = scan.nextLine();

		BufferedReader questions = new BufferedReader(new FileReader(questionsScan)); // BufferedReader is used here to
																						// read the file.
		BufferedReader answers = new BufferedReader(new FileReader(answersScan)); // BufferedReader is used here to read
																					// the file.

		// Prompting the user to enter file
		System.out.println("Enter where do you want the merged text file stored: ");
		String solutionScan = scan.nextLine();
		PrintWriter solution = new PrintWriter(solutionScan);

		String qline = questions.readLine(); // Reading the first line of the txt file.
		String aline = answers.readLine(); // Reading the first line of the txt file.

		// Loop condition is not equal to null as the the last line is null.
		while (aline != null) {
			solution.println(qline);
			solution.print(aline);
			qline = questions.readLine();
			aline = answers.readLine();
		}

		// Output message for user
		System.out.println("Questions text file and Answers text file successfuly Merged.");

		scan.close(); // Closed to handle leak
		solution.flush(); // Is used to clear the writer.
		questions.close(); // Closed the BufferedReader to handle leak.
		answers.close(); // Closed the BufferedReader to handle leak.
		solution.close(); // Closed the BufferedReader to handle leak.
	}
}