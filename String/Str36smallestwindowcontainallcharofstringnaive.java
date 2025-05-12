import java.util.Arrays;
public class Str36smallestwindowcontainallcharofstringnaive {
    public static boolean containsAllChar(String str,String p ){
        int count[]=new int[256];
        Arrays.fill(count,0);
        for(char ch:p.toCharArray())
        count[ch]++;
        for(char ch:str.toCharArray()){
            if(count[ch]>0)
            count[ch]--;
        }
        for(int c:count){
            if(c>0)
            return false;
        }
        return true;
    }
    public static String findSmallestSubstring(String str,String p){
        int m=str.length();
        String smallestSubstring="";
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                String substr=str.substring(i,j+1);
                if(containsAllChar(substr,p)){
                    int currLen=substr.length();
                    if(currLen<minLen){
                        minLen=currLen;
                        smallestSubstring=substr;
                    }
                }
            }
        }
        return smallestSubstring;
    }
    public static void main(String args[]){
        String str="timetopractice";
        String p="toc";
        String result=findSmallestSubstring(str,p);
        if(!result.isEmpty()){
            System.out.println(result);
        }
        else{
            System.out.println(-1);
        }
    }
}
