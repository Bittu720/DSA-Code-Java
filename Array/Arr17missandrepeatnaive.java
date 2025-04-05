public class Arr17missandrepeatnaive {
    static int[] findTwoElement(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            }
            else if (freq[i] == 2) {
                repeating = i;
            }
        }
        return new int[] {repeating, missing};
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        int[] ans = findTwoElement(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
  
