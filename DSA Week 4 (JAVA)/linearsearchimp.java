public class linearsearchimp {
    public static int search(int[] arr, int target) {
        int n = arr.length;

        // Iterate linearly through the array
        for (int i = 0; i < n; i++) 
            if (arr[i] == target)
                return i;
         return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 1, 6, 9, 8};
        int target = 1;
        int index = search(arr, target);
        System.out.println(index);
    }
}      
    
    

