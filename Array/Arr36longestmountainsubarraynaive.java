public class Arr36longestmountainsubarraynaive {
    public static int longestmountain(int arr[]){
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int increment=0,decrement=0;
            while(j<n && arr[j]>arr[j-1]){
                increment=1;
                j++;
            }
            while(j<n && arr[j]<arr[j-1]){
                decrement=1;
                j++;
            }
            if(increment==1 && decrement==1){
                res=Math.max(res,j-i);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,3,1,4,5,6,7,8,9,8,7,6,5};
        System.out.println(longestmountain(arr));
    }
}
