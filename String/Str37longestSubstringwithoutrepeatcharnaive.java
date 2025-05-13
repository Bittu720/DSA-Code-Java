public class Str37longestSubstringwithoutrepeatcharnaive {
    static int longestuniquesubstr(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean vis[]=new boolean[26];
            for(int j=i;j<n;j++){
                if(vis[str.charAt(j)-'a']==true)
                break;
                else{
                    res=Math.max(res,j-i+1);
                    vis[str.charAt(j)-'a']=true;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        String str="geeksforgeeks";
        System.out.println(longestuniquesubstr(str));
    }
}
