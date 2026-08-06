public class ExceptionHandling {
    public static void main(String[] args) {
        // Example 1: ArithmeticException
        System.out.println("Example 1: Division by Zero");
        int n = 10;
        int m = 0;
        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by 0!");
        }
        System.out.println("-----------------------------");
        // Example 2: ArrayIndexOutOfBoundsException with finally
        System.out.println("Example 2: Array Exception");
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");
    }
}
