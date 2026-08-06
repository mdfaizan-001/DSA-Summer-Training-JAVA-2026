public class InsertElementArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int pos = 3;
        int value = 35;
        for(int i = 4; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
        for(int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
