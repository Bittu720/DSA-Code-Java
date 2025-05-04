import java.util.Arrays;
public class Str17countdistictsubsequence {
 static int distinctSubsequences(String str){
    int n=str.length();
    int last[]=new int[26];
    Arrays.fill(last,0);
    int res=1;
    for(int i=1;i<=n;i++){
        int curr=2*res-last[str.charAt(i-1)-'a'];
        last[str.charAt(i-1)-'a']=res;
        res=curr;
    }
    return res;
 }  
 public static void main(String args[]){
    String str="gfg";
    System.out.println(distinctSubsequences(str));
 } 
}
