 class Str39countsubstringwithkcharnaive{
    static int countsubstr(String str,int k){
int n=str.length();
int ans=0;
for(int i=0;i<n;i++){
    boolean map[]=new boolean[26];
    int distinctcnt=0;
    for(int j=i;j<n;j++){
        if(!map[str.charAt(j)-'a']){
            map[str.charAt(j)-'a']=true;
            distinctcnt++;
        }
        if(distinctcnt==k)
        ans++;
    }
}
return ans;
    }
    public static void main(String args[]){
        String str="abc";
        int k=2;
        System.out.println(countsubstr(str,k));
    }
}