import java.util.ArrayList;
import java.util.Collections;
public class Arr15leaderseff {
static ArrayList<Integer>leaders(int arr[]){
    ArrayList<Integer>result=new ArrayList<>();
    int n=arr.length;
    int maxRight=arr[n-1];
    result.add(maxRight);
    for(int i=n-2;i>=0;i--){
        if(arr[i]>=maxRight){
            maxRight=arr[i];
            result.add(maxRight);
        }
    }
    Collections.reverse(result);
    return result;
}
public static void main(String args[]){
    int arr[]={16,17,4,3,5,2};
    ArrayList<Integer> result=leaders(arr);
    for(int res:result){
        System.out.print(res+" ");
    }
    System.out.println();
}
}
