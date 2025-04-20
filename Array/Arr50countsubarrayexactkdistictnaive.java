public class Arr50countsubarrayexactkdistictnaive {
    static int exactlyK(int arr[], int k) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[101]; 
            int distinct = 0;
            for (int j = i; j < n; j++) {
                if (freq[arr[j]] == 0) {
                    distinct++;
                }
                freq[arr[j]]++;
                if (distinct > k)
                    break;
                if (distinct == k)
                    res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3};
        int k = 2;
        System.out.println(exactlyK(arr, k));
    }
}

