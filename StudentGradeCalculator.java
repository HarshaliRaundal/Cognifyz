//Student Grade Calculator

/*create a program that calculates and displays the average grade of a student. 
Prompt the user to enter the number of grades to be entered, and then input each grade. Calculate the average and display it to the user. */

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of grades to be entered: ");
        int numOfGrades = sc.nextInt();
        
        double[] grades = new double[numOfGrades];
        double sum = 0.0;
        
        // Input grades
        for (int i = 0; i < numOfGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }
        
        // Calculate average
        double average = sum / numOfGrades;
        
        // Display average
        System.out.printf("The average grade is: %.2f%n", average);
        
        sc.close();
    }
}
