import java.util.Scanner;
public class Arrthreegreatcandidate{
    static int maxProduct(int arr[],int n)
    {
        int max_product = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
 max_product = Math.max(max_product,arr[i] * arr[j]* arr[k]);
        return max_product;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter size of array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter element in array : ");
    for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
    }
    sc.close();
        int res = maxProduct(arr,n);
        System.out.println(res);
    }
}
 

