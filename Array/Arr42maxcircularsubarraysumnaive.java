public class Arr42maxcircularsubarraysumnaive {
  static int circularsubarraySum(int arr[]){
 int n=arr.length;
 int res=arr[0];
 for(int i=0;i<n;i++){
    int currsum=0;
 for(int j=0;j<n;j++){
    int idx=(i+j)%n;
    currsum=currsum+arr[idx];
    res=Math.max(res,currsum);
 }
  }
  return res;
}
public static void main(String args[]){
    int arr[]={8,-8,9,-9,10,-11,12};
    System.out.println(circularsubarraySum(arr));
}
}
