public class Arr28countsubarrayhaveproductlessthanknaive {
    static int countSubArray(int arr[], int n, int k) {
        int count = 0;
        int i, j, mul;
        for (i = 0; i < n; i++) {
            mul = arr[i];
            if (mul < k) 
                count++;
            for (j = i + 1; j < n; j++) {
                mul = mul * arr[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int k = 10;
        int n = arr.length;
        int Count = countSubArray(arr, n, k);
        System.out.print(Count);
    }
}
