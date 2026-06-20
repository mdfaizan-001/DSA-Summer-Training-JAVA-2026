import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double obtainedMarks, totalMarks, percentage;
            System.out.print("Enter Obtained Marks: ");
            obtainedMarks = sc.nextDouble();
            System.out.print("Enter Total Marks: ");
            totalMarks = sc.nextDouble();
            percentage = (obtainedMarks / totalMarks) * 100;
            System.out.println("Percentage = " + percentage + "%");
        }
    }
}