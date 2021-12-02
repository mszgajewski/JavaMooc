package GradeStatistics;

import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }
        public void addGrade(int grade){
        if(grade >= 0 && grade <= 100)
            this.grades.add(grade);
        }

        public double gradeAverage(){
            int sum = 0;
            for(int grade : grades){
                sum += grade;
            }
            return 1.0 * sum / grades.size();
        }

        public double gradeAveragePassing(){
            int sum = 0;
            int count = 0;

            for(int grade : grades){
                if (grade > 49){
                    sum+= grade;
                    count++;
                }
            }
            if(sum == 0) {
                return 0;
            } else {
                return 1.0 * sum / count;
            }
        }

        public float passingPercentage(){
        int count = 0;
            for(int grade : grades){
                if (grade > 49) {
                    count++;
                }
            }
            return (float) 100 * count / grades.size();
        }

    public int numberOfGrades() {
        int grade = 5;
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
                grade--;
            }
        }

        return count;
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = numberOfGrades();
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;

        }
    }

    public void printGrades() {

        System.out.print("Point average (all): " + this.gradeAverage() + "\n"
                + "Point average (passing): " + this.gradeAveragePassing() + "\n"
                + "Pass percentage: " + this.passingPercentage() + "\n");

        printGradeDistribution();

    }

}
