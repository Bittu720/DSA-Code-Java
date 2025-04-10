import java.util.Arrays;

public class Arr27arrayproductexceptbetter {
    static int[] ProductArray(int arr[]) { 
        int n = arr.length;
        int preproduct[] = new int[n];
        int suffproduct[] = new int[n];
        int res[] = new int[n];
        preproduct[0] = 1;
        for (int i = 1; i < n; i++)
            preproduct[i] = arr[i - 1] * preproduct[i - 1];
        suffproduct[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--)
            suffproduct[j] = arr[j + 1] * suffproduct[j + 1];

        for (int i = 0; i < n; i++)
            res[i] = preproduct[i] * suffproduct[i];

        return res; 
    }
    public static void main(String args[]) {
        int arr[] = {10, 3, 5, 6, 2};
        int res[] = ProductArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
