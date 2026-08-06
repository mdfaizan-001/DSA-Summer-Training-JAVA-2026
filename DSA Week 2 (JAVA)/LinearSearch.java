import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Element: ");
            int key = sc.nextInt();
            boolean found = false;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == key) {
                    System.out.println("Found at Index " + i);
                    found = true;
                    break;
                }
            }
            if(!found)
                System.out.println("Element Not Found");
        }
    }
}
