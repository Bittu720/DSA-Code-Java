import java.util.Arrays;
public class Arr39minincrementnaive {
 public static int minOperation(int arr[]){
    int n=arr.length;
    int count=0;
    Arrays.sort(arr);
    while(arr[0]!=arr[n-1]){
        for(int i=0;i<n-1;i++){
            arr[i]++;
        }
        count++;
        Arrays.sort(arr);
    }
    return count;
 }  
 public static void main(String args[]){
    int arr[]={1,2,3};
    System.out.println(minOperation(arr));
 } 
}
