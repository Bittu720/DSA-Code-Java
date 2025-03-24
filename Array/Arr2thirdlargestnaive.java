import java.util.Arrays;
import java.util.Scanner;
public class Arrthirdlargestnaive {
        static int thirdlargest(int arr[],int n) { 
            Arrays.sort(arr); 
            return arr[n - 3];
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

