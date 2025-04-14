import java.util.Arrays;

public class Arr37sortaraayuseequationnaive {
   public static void Applyequation(int arr[],int n,int a,int b,int c){
    for(int i=0;i<n;i++){
        arr[i]=a*arr[i]*arr[i]+b*arr[i]+c;
    }
   } 
   public static void main(String args[]){
    int arr[]={-21,-15,12,13,14};
    int n=arr.length;
    int a=-6,b=-7,c=2;
    Applyequation(arr,n,a,b,c);
    Arrays.sort(arr);
    System.out.print("Array after sorting is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
   }
}
