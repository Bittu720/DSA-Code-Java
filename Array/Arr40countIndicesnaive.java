public class Arr40countIndicesnaive {
  public static int countIndices(int arr[]){
    int n=arr.length;
    int count=0;
    for(int i=0;i<n;i++){
        int evensum=0,oddsum=0;
        int k=0;
        for(int j=0;j<n;j++){
            if(j==i)
            continue;
            if(k%2==0){
                evensum+=arr[j];
            }
            else {
                oddsum+=arr[j];
            }
            k++;
        }
        if(evensum==oddsum){
            count++;
        }
    }
    return count;
  }  
  public static void main(String args[]){
    int arr[]={2,1,6,4};
    System.out.println(countIndices(arr));
  }
}
