public class missing_number {
    public static int missing_number_finder(int arr[]){
        int sum = (arr.length+1)*(arr.length+2)/2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int a = missing_number_finder(arr);
        System.out.println(a);
    }
}
