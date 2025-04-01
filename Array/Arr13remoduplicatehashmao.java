import java.util.HashSet;
public class Arr13remoduplicatehashmao {
 static int remodup(int arr[]){
    HashSet<Integer>s=new HashSet<>();
    int index=0;
    for(int i=0;i<arr.length;i++){
        if(!s.contains(arr[i])){
            s.add(arr[i]);
            arr[index++]=arr[i];
        }
    }
    return index;
 } 
 public static void main(String args[]){
    int arr[]={1,2,2,3,4,4,4,5,5};
    int newSize=remodup(arr);
    for(int i=0;i<newSize;i++){
        System.out.println(arr[i]+" ");
    }
 }  
}
