import java.util.Arrays;
public class Str6longestcommonprefixnaive {
  static String longestcommonprefix(String arr[]){
    Arrays.sort(arr);
    String first=arr[0];
    String last=arr[arr.length-1];
    int minlength=Math.min(first.length(),last.length());
    int i=0;
    while(i<minlength && first.charAt(i)==last.charAt(i)){
        i++;
    }
    return first.substring(0,i);
  }  
  public static void main(String args[]){
    String arr[]={"geeksfor","geeks","geek","geezer"};
    System.out.println(longestcommonprefix(arr));
  }
}
