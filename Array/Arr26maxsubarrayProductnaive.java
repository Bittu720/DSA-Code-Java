public class Arr26maxsubarrayProductnaive {
   static int maxProduct(int arr[]){
    int n=arr.length;
    int result=arr[0];
    for(int i=0;i<n;i++){
        int mul=1;
        for(int j=i;j<n;j++){
            mul*=arr[j];
            result=Math.max(result,mul);
        }
    }
    return result;
   } 
   public static void main(String args[]){
    int arr[]={-2,6,-3,-10,0,2};
    System.out.println(maxProduct(arr));
   }
}
