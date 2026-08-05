import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius, area;
            System.out.print("Enter radius: ");
            radius = sc.nextDouble();
            area = 3.14159 * radius * radius;
            System.out.println("Area of Circle = " + area);
        }
    }
}
