public class Str19licensekeyFormattingupperCasenaive {
   public static String REformating(String str,int k){
    String temp="";
    int n=str.length();
    for(int i=0;i<n;i++){
        if(str.charAt(i)!='-'){
            temp+=(Character.toUpperCase(str.charAt(i)));
        }
    }
    int len=temp.length();
    String ans="";
    int val=k;
    for(int i=len-1;i>=0;i--){
        if(val==0){
            val=k;
            ans+='-';
        }
        ans+=temp.charAt(i);
        val--;
    }
    char charArray[]=ans.toCharArray();
    reverse(charArray,charArray.length);
    String res=new String (charArray);
    return res;
   } 
   static void reverse(char a[],int n){
    char t;
    for(int i=0;i<n/2;i++){
        t=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=t;
    }
   }
   public static void main(String args[]){
    String str="5F3z-9-w";
    int k=4;
    System.out.println(REformating(str,k));
   }
}
