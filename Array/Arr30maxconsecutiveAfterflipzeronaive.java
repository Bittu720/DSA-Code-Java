public class Arr30maxconsecutiveAfterflipzeronaive {
 static int maxOnes(int arr[],int k){
 int res=0;
 for(int i=0;i<arr.length;i++){
    int count=0;
    for(int j=i;j<arr.length;j++){
        if(arr[j]==0)
        count++;
        if(count<=k)
        res=Math.max(res,(j-i+1));
    }
 }
 return res;
}
public static void  main(String args[]){
    int arr[]={1,0,0,1,1,0,1,0,1,1,1};
    int k=2;
    System.out.println(maxOnes(arr,k));
}
}
