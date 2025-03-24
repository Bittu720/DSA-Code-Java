import java.util.Scanner;
public class Arrthirdlargesteff2{
    static int thirdlargest(int arr[],int n) { 
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE,
        third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
     System.out.println("enter size of array :");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter number :");
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
         sc.close();
         System.out.print("second largest is : ");
        System.out.println(thirdlargest(arr,n));
    }
}
  
