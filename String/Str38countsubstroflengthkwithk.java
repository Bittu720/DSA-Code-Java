public class Str38countsubstroflengthkwithk {
   static int countOfSubString(String str,int k){
    int n=str.length();
    int count=0;
    for(int i=0;i<n-k+1;i++){
        int cnt[]=new int[26];
        for(int j=i;j<i+k;j++)
        cnt[str.charAt(j)-'a']++;
        int distinctcnt=0;
        for(int l=0;l<26;l++){
            if(cnt[l]>0){
                distinctcnt++;
            }
        }
        if(distinctcnt==k-1)
        count++;
    }
    return count;
   }
   public static void main(String args[]){
    String str="abcc";
    int k=2;
    System.out.println(countOfSubString(str,k));
   }
   
}
