import java.util.Scanner;

public class AscendingOrderCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            boolean ascending = true;
            
            System.out.println("Enter 5 numbers:");
            
            for(int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            
            for(int i = 0; i < 4; i++) {
                if(arr[i] > arr[i + 1]) {
                    ascending = false;
                    break;
                }
            }
            
            if(ascending)
                System.out.println("Array is in Ascending Order");
            else
                System.out.println("Array is not in Ascending Order");
        }
    }
}
