import java.util.Scanner;
public class ArraySearch {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            int search;
            boolean found = false;
            System.out.println("Enter 5 numbers:");
            for(int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter element to search: ");
            search = sc.nextInt();
            for(int i = 0; i < 5; i++) {
                if(arr[i] == search) {
                    found = true;
                    break;
                }
            }
            
            if(found)
                System.out.println("Element Found");
            else
                System.out.println("Element Not Found");
        }
    }
}
