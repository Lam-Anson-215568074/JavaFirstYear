import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// name prompt
	System.out.println("What is your name?");
	String name = input.nextLine();
	
	// quiz prompts with score and name
	System.out.println(name + ", what is your score for Quiz 1 (out of 100)?");
	int Q1 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 2 (out of 100)?");
	int Q2 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 3 (out of 100)?");
	int Q3 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 4 (out of 100)?");
	int Q4 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 5 (out of 100)?");
	int Q5 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 6 (out of 100)?");
	int Q6 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 7 (out of 100)?");
	int Q7 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 8 (out of 100)?");
	int Q8 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Quiz 9 (out of 100)?");
	int Q9 = input.nextInt();
	input.nextLine();
	
	// Assigment marks and prompt
	System.out.println(name + ", what is your score for Assignment 1 (out of 100)?");
	int A1 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 2 (out of 100)?");
	int A2 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 3 (out of 100)?");
	int A3 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 4 (out of 100)?");
	int A4 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 5 (out of 100)?");
	int A5 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 6 (out of 100)?");
	int A6 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 7 (out of 100)?");
	int A7 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 8 (out of 100)?");
	int A8 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 9 (out of 100)?");
	int A9 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Assignment 10 (out of 100)?");
	int A10 = input.nextInt();
	input.nextLine();
	
	// Lab Test prompt and marks
	System.out.println(name + ", what is your score for Lab Test 1 (out of 100)?");
	int LT1 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Lab Test 2 (out of 100)?");
	int LT2 = input.nextInt();
	input.nextLine();
	
	System.out.println(name + ", what is your score for Lab Test 3 (out of 100)?");
	int LT3 = input.nextInt();
	input.nextLine();
	
	// midterm score and prompt
	System.out.println(name + ", what is your midterm score (out of 100)?");
	int m = input.nextInt();
	input.nextLine();
	
	// final exam score and prompt
	System.out.println(name + ", what is your final exam score (out of 100)?");
	int f = input.nextInt();
	input.nextLine();
	
	//course name prompt
	System.out.println(name + ", which course are you talking about?");
	String course = input.nextLine();
	
	//summary print
	System.out.println(name + ", here is your grading report for " + course);
	System.out.println("-----------------------------------------------");
	
	// Quiz summary	
	System.out.println("Quiz 1: " + Q1);
	System.out.println("Quiz 2: " + Q2);
	System.out.println("Quiz 3: " + Q3);
	System.out.println("Quiz 4: " + Q4);
	System.out.println("Quiz 5: " + Q5);
	System.out.println("Quiz 6: " + Q6);
	System.out.println("Quiz 7: " + Q7);
	System.out.println("Quiz 8: " + Q8);
	System.out.println("Quiz 9: " + Q9);
	System.out.println("-----------------------------------------------");
	
	//Assignment summary
	System.out.println("Assignment 1: " + A1);
	System.out.println("Assignment 2: " + A2);
	System.out.println("Assignment 3: " + A3);
	System.out.println("Assignment 4: " + A4);
	System.out.println("Assignment 5: " + A5);
	System.out.println("Assignment 6: " + A6);
	System.out.println("Assignment 7: " + A7);
	System.out.println("Assignment 8: " + A8);
	System.out.println("Assignment 9: " + A9);
	System.out.println("Assignment 10: " + A10);
	System.out.println("-----------------------------------------------");
	
	//Lab Test summary
	System.out.println("Lab Test 1: " + LT1);
	System.out.println("Lab Test 2: " + LT2);
	System.out.println("Lab Test 3: " + LT3);
	System.out.println("-----------------------------------------------");
	
	// Midterm and Final summary
	System.out.println("Midterm Test: " + m);
	System.out.println("Final Exam: " + f);
	System.out.println("-----------------------------------------------");
	
	//Average calculations
	double QAvg = (Q1 + Q2 + Q3 + Q4 + Q5 + Q6 + Q7 + Q8 + Q9) / 9;
	double AAvg = (A1 + A2 + A3 + A4 + A5 + A6 + A7 + A8 + A9 + A10) / 10;
	double LTAvg = (LT1 + LT2 + LT3) / 3;
	
	//Summary of Averages
	System.out.println("Average of quizzes: " + QAvg);
	System.out.println("Average of assignments: " + AAvg);
	System.out.println("Average of lab tests: " + LTAvg);
	
	//Raw mark Calculation 
	 double Raw = (QAvg * 0.18) + (AAvg * 0.2) + (LTAvg * 0.12) + (m * 0.15) + (f * 0.35);
	 System.out.println("Final raw marks: " + Raw);
	
	 input.close();
	}

}
