public class Arr20majorityElementeff {
   static int majorityElement(int arr[]){
    int n=arr.length;
    int candidate=-1;
    int count=0;
    for(int num :arr){
        if(count==0){
            candidate=num;
            count=1;
        }
        else if(num==candidate){
            count++;
        }
        else{
            count--;
        }
    }
    count=0;
    for(int num:arr){
        if(num==candidate){
            count++;
        }
    }
    if(count>n/2){
        return candidate;
    }
    else{
        return -1;
    }
   } 
   public static void main(String args[]){
    int arr[]={1,1,2,1,3,5,1};
    System.out.println(majorityElement(arr));
   }
}
