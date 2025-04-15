public class Arr38swapallonetogethernaive {
    static int minswap(int arr[]){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
            count++;
        }
        if(count==0)
        return 0;
        int minSwap=Integer.MAX_VALUE;
        for(int i=0;i<=n-count;i++){
            int count1=0;
            for(int j=i;j<i+count;j++){
                if(arr[j]==1)
                count1++;
            }
            minSwap=Math.min(minSwap,count-count1);
        }
        return minSwap;
    }
    public static void main(String args[]){
        int arr[]={1,0,1,0,1};
        System.out.println(minswap(arr));
    }
}
