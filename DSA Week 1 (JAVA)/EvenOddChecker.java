import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        }
    }
}
