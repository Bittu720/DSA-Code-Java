
import java.util.*;
class Arr8waveformsortnaive {
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int arr[], int n) {
        Arrays.sort(arr); 
        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arr8waveformsortnaive ob = new Arr8waveformsortnaive(); 
        ob.sortInWave(arr, n); 
        System.out.println("Array in wave form:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close(); 
    }
}