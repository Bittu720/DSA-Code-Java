import java.util.Arrays;
public class Arr20majorityelementbetter {
 static int majorityElement(int arr[]){
    int n=arr.length;
    if(n==1)
    return arr[0];
    int count=1;
    Arrays.sort(arr);
    for(int i=1;i<n;i++){
        if(arr[i-1]==arr[i]){
            count++;
        }
        else{
            if(count>n/2){
                return arr[i-1];
            }
            count=1;
        }
    }
    if(count>n/2){
        return arr[n-1];
    }
    return -1;
 }  
 public static void main(String args[]){
    int arr[]={1,1,2,1,3,5,1};
    System.out.println(majorityElement(arr));
 } 
}
