public class Str28minimumrepeats1suchs2isasubstringnaive {
  static int minRepeats(String str1,String str2){
    int n=str1.length(),m=str2.length();
    for(int i=0;i<n;i++){
        int rep=1,idx1=i;
        boolean found=true;
        for(int idx2=0;idx2<m;idx2++){
            if(str1.charAt(idx1)!=str2.charAt(idx2)){
                found=false;
                break;
            }
            idx1++;
            if(idx1==n){
                idx1=0;
                if(idx2!=m-1)
                rep++;
            }
        }
        if(found)
        return rep;
    }
    return -1;
  } 
  public static void main(String args[]){
    String str1="abcd";
    String str2="cdabcdab";
    System.out.println(minRepeats(str1,str2));
  } 
}
