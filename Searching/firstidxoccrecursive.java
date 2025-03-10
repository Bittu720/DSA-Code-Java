import java.util.Scanner;
class firstidxoccrecursive{
    static int firstOcc(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] > x)
            return firstOcc(arr, low, mid - 1, x);
        else if (arr[mid] < x)
            return firstOcc(arr, mid + 1, high, x);
        else {
            if (mid == 0 || arr[mid - 1] != arr[mid])
                return mid; 
            else
                return firstOcc(arr, low, mid - 1, x); 
        }
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
        int result = firstOcc(arr, 0, n - 1, x);
        if (result != -1)
            System.out.println(x + " first appears at index " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}
