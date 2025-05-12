import java.util.*;
public class Str35longestsubstringwithkuniquecharnaive {
  static int longestksubstring(String str,int k){
    int n=str.length();
    int answer=-1;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<=n;j++){
            HashSet<Character>distinct=new HashSet<Character>();
            for(int x=i;x<j;x++){
                distinct.add(str.charAt(x));
            }
            if(distinct.size()==k){
                answer=Math.max(answer,j-i);
            }
        }
    }
    return answer;
  }
  public static void main(String args[]){
    String str="aabacbebebe";
    int k=3;
    System.out.println(longestksubstring(str,k));
  }
}
