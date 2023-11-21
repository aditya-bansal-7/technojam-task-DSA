public class reverse_an_array {

    public static void reverse_array(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2};
        reverse_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
