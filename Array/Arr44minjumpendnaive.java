public class Arr44minjumpendnaive {
  static int minjump(int i,int arr[],int memo[]){
    if(i==arr.length-1)
    return 0;
    if(memo[i]!=-1)
    return memo[i];
    int ans=Integer.MAX_VALUE;
    for(int j=i+1;j<=i+arr[i] && j<arr.length;j++){
        int val=minjump(j,arr,memo);
        if(val!=Integer.MAX_VALUE)
ans=Math.min(ans,1+val);
    }
    return memo[i]=ans;
  } 
  static int minJump(int arr[]){
    int memo[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        memo[i]=-1;
    }
    int ans=minjump(0,arr,memo);
    if(ans==Integer.MAX_VALUE)
    return -1;
    return ans;
  }
  public static void main(String args[]){
    int arr[]={1,3,5,8,9,2,6,7,6,8,9};
    System.out.println(minJump(arr));
  } 
}
