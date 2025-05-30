import java.util.Scanner;
class lastidxocciterative{    
    static int lastOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
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
        int result = lastOcc(arr, n, x);
        if (result != -1)
            System.out.println("Last occurrence of " + x + " is at index: " + result);
        else
            System.out.println(x + " is not present in the array.");
    }
}
