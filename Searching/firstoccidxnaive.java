import java.util.Scanner;
class firstoccidxnaive {
    static int firstOccurrence(int arr[], int low, int high, int x) {
        int result = -1;   
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;  
                high = mid - 1; 
            } else if (arr[mid] > x) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();
        sc.close();
        int result = firstOccurrence(arr, 0, n - 1, x);
        if (result != -1)
            System.out.println(x + " first appears at index " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}
