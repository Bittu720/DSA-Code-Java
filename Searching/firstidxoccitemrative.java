import java.util.Scanner;
class firstidxocciterative{  
    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] < x)
                low = mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid; 
                else
                    high = mid - 1; 
            }
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
        int result = firstOcc(arr, n, x);
        if (result != -1)
            System.out.println(x + " first appears at index " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}
