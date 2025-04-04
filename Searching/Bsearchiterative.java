import java.util.Scanner;
class bsearchiterative{  
    static int bSearch(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
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
        int result = bSearch(arr, n, x);
        if (result != -1)
            System.out.println(x + " found at index " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}
