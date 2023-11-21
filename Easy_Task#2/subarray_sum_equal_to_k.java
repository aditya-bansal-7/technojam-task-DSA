public class subarray_sum_equal_to_k {
  public static int subarray_sum_equal_k(int arr[] , int k){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == k){
                    a++;
                }
            }
        }
        return a;
    }
  public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        int a = subarray_sum_equal_k(arr, 2);
        System.out.println(a);
