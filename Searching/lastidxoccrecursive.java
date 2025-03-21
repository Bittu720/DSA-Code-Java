import java.util.Scanner;
class lastidxoccrecursive{  
    static int lastOcc(int arr[], int low, int high, int x, int n) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (x > arr[mid])
            return lastOcc(arr, mid + 1, high, x, n);
        else if (x < arr[mid])
            return lastOcc(arr, low, mid - 1, x, n);
        else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;
            else
                return lastOcc(arr, mid + 1, high, x, n);
        }
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
        System.out.print("Enter the element to find the last occurrence: ");
        int x = sc.nextInt();
        sc.close();
        int result = lastOcc(arr, 0, n - 1, x, n);
        if (result != -1)
            System.out.println("Last occurrence of " + x + " is at index: " + result);
        else
            System.out.println(x + " is not present in the array.");
    }
}
