package GradeStatistics;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner, GradeStatistics gradeStatistics){
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start(){
        System.out.println("Enter points total, -1 stops:");
        while (true){
            int grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1){
                gradeStatistics.printGrades();
                break;
            } else {
                gradeStatistics.addGrade(grade);
            }
        }
    }
}
