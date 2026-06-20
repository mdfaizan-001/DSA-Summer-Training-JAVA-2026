import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double principal, rate, time, si;
            System.out.print("Enter Principal Amount: ");
            principal = sc.nextDouble();
            System.out.print("Enter Rate: ");
            rate = sc.nextDouble();
            System.out.print("Enter Time: ");
            time = sc.nextDouble();
            si = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + si);
        }
    }
}
