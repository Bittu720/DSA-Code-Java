public class Str21countSubstringwithequal012naive {
  public static int countsubstr(String str){
    int n=str.length();
    int count=0;
    for(int i=0;i<n;i++){
for(int j=i+1;j<=n;j++){
    String substr=str.substring(i,j);
    int count0=0,count1=0,count2=0;
    for(char c:substr.toCharArray()){
        if(c=='0')
        count0++;
        if(c=='1')
        count1++;
        if(c=='2')
        count2++;
    }
    if(count0==count1 && count1==count2){
        count++;
    }
}
    }
    return count;
  }  
  public static void main(String args[]){
    String str="0102010";
    System.out.println(countsubstr(str));
  }
}
