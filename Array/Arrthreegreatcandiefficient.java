import java.util.Scanner;

public class Arrthreegreatcandiefficient{
    static int maxProduct(int arr[],int n) {
        int maxA = Integer.MIN_VALUE, 
        maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if (arr[i] > maxB) {
                maxC = maxB;
                maxB = arr[i];
            } else if (arr[i] > maxC) {
                maxC = arr[i];
            }
            if (arr[i] < minA) {
                minB = minA;
                minA = arr[i];
            } else if (arr[i] < minB) {
                minB = arr[i];
            }
        }

        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.print("enter size of array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter element in array : ");
    for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
    }
    sc.close();
        System.out.println(maxProduct(arr,n));
}
}

