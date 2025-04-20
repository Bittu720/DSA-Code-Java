import java.util.Arrays;
public class Arr49minimumcandydistributionnaive {
 public static int minCandy(int arr[]){
    int n=arr.length;
    if(n==0)
    return 0;
    int leftcandy[]=new int[n];
    int rightcandy[]=new int[n];
    Arrays.fill(leftcandy,1);
    Arrays.fill(rightcandy,1);
    for(int i=1;i<n;i++){
        if(arr[i]>arr[i-1])
        leftcandy[i]=leftcandy[i-1]+1;
    }
    for(int i=n-2;i>=0;i--){
        if(arr[i]>arr[i+1])
        rightcandy[i]=rightcandy[i+1]+1;
    }
    int res=0;
    for(int i=0;i<n;i++){
        res+=Math.max(leftcandy[i],rightcandy[i]);
    }
    return res;
 }  
 public static void main(String args[]){
    int arr[]={15,40,32,12,17,23};
    System.out.println(minCandy(arr));
 } 
}
