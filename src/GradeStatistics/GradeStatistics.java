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

        public double passingPercentage(){
        int count = 0;
            for(int grade : grades){
                if (grade > 49) {
                    count++;
                }
            }
            return 100.0 * count / grades.size();
        }

    public void printGradeDistribution() {

        int[] gradeDistArr = new int[6]; // 0 through 5

        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeDistArr[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }

    }

    public void printGrades() {

        System.out.print("Point average (all): " + this.gradeAverage() + "\n"
                + "Point average (passing): " + this.gradeAveragePassing() + "\n"
                + "Pass percentage: " + this.passingPercentage() + "\n");

        printGradeDistribution();

    }

}
