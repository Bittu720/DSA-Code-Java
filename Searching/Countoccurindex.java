import java.util.Scanner;

class countoccurindex{
    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                result = mid;
                high = mid - 1; 
            }
        }
        return result;
    }
    static int lastOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                result = mid;  
                low = mid + 1; 
            }
        }
        return result;
    }
    static int countOcc(int arr[], int n, int x) {
        int first = firstOcc(arr, n, x);
        if (first == -1)
            return 0;
        else
            return lastOcc(arr, n, x) - first + 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to count occurrences: ");
        int x = sc.nextInt();
        sc.close();
        int count = countOcc(arr, n, x);
        System.out.println("Count of " + x + " is: " + count);
    }
}
