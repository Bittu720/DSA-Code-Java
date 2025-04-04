import java.util.Arrays;

public class Arr14insertdupadjacentnaive {
    public static int[] dupcateK(int arr[], int k) {
        int n = arr.length;
        int res[] = new int[n * 2]; 
        int index = 0;
        for (int i = 0; i < n; i++) {
            res[index++] = arr[i]; 
            if (arr[i] == k) {
                res[index++] = k; 
            }
        }
        return Arrays.copyOf(res, index); 
    }
    public static void main(String args[]) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0}; 
        int k = 0; 
        int answer[] = dupcateK(arr, k); 
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
