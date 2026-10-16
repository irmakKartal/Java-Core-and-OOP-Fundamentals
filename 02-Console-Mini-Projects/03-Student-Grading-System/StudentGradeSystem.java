import java.util.Scanner;

/**
 * University Student Grading System
 * Calculates overall lecture score (40% Midterm + 60% Final) and determines letter grade.
 */
public class StudentGradeSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          Student Course Grading System           ");
        System.out.println("==================================================");

        System.out.print("Enter Midterm Exam Score (0 - 100): ");
        double midterm = scan.nextDouble();

        System.out.print("Enter Final Exam Score (0 - 100): ");
        double finalExam = scan.nextDouble();

        double totalScore = (midterm * 0.40) + (finalExam * 0.60);
        String letterGrade;
        String status;

        if (totalScore >= 85) {
            letterGrade = "AA";
            status = "PASSED (Excellent)";
        } else if (totalScore >= 80) {
            letterGrade = "BA";
            status = "PASSED (Very Good)";
        } else if (totalScore >= 75) {
            letterGrade = "BB";
            status = "PASSED (Good)";
        } else if (totalScore >= 65) {
            letterGrade = "CB";
            status = "PASSED (Satisfactory)";
        } else if (totalScore >= 60) {
            letterGrade = "CC";
            status = "PASSED (Satisfactory)";
        } else if (totalScore >= 55) {
            letterGrade = "CD";
            status = "PASSED (Conditional)";
        } else if (totalScore >= 50) {
            letterGrade = "DD";
            status = "PASSED (Conditional)";
        } else {
            letterGrade = "FF";
            status = "FAILED";
        }

        System.out.println("\n==================================================");
        System.out.println("                   GRADE REPORT                   ");
        System.out.println("==================================================");
        System.out.printf(" Weighted Score : %.2f / 100\n", totalScore);
        System.out.println(" Letter Grade   : " + letterGrade);
        System.out.println(" Academic Status: " + status);
        System.out.println("==================================================");

        scan.close();
    }
}
