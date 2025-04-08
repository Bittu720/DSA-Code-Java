public class Arr21majoritynaivep2 {
  static void findmajority(int arr[]){
    int n=arr.length;
    int firstmajority=-1;
    int secondmajority=-1;
    int firstcount=0;
    int seccount=0;
    for(int i=0;i<n;i++){
        if(arr[i]==firstmajority){
            firstcount++;
        }
        else if(arr[i]==secondmajority){
            seccount++;
        }
        else if(firstcount==0){
            firstmajority=arr[i];
            firstcount=1;
        }
        else if(seccount==0){
            secondmajority=arr[i];
            seccount=1;
        }
        else{
            firstcount--;
            seccount--;
        }
    }
    firstcount=0;
    seccount=0;
    for(int i=0;i<n;i++){
        if(arr[i]==firstmajority)
        firstcount++;
        else if(arr[i]==secondmajority)
        seccount++;
    }
    if(firstcount>n/3){
        System.out.print(firstmajority+" ");
    }
    if(seccount>n/3){
        System.out.print(secondmajority+" ");
    }
  } 
  public static void main(String args[]){
    int arr[]={2,2,3,1,3,2,1,1};
    findmajority(arr);
  } 
}
