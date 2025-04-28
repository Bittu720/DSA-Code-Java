public class Str6longestcommonprefixwordmatch {
   static int commonprefixlen(String s1,String s2){
    int idx=0;
    int len=Math.min(s1.length(),s2.length());
    while(idx<len && s1.charAt(idx)==s2.charAt(idx)){
        idx++;
    }
    return idx;
   } 
   static String longestcommonprefix(String arr[]){
    String res=arr[0];
    for(int i=0;i<arr.length;i++){
        int len=commonprefixlen(res,arr[i]);
        res=res.substring(0,len);
    }
    return res;
   }
   public static void main(String args[]){
    String arr[]={"geeksfor","geek","geen","geezer"};
    System.out.println(longestcommonprefix(arr));
   }
}
