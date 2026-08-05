import java.util.Scanner;
public class AverageOfNNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            double num, sum = 0, average;
            System.out.print("Enter number of values: ");
            n = sc.nextInt();
            for(int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                num = sc.nextDouble();
                sum += num;
            }   average = sum / n;
            System.out.println("Average = " + average);
        }
    }
}
