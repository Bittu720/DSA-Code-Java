public class Str16mindeletemakestringPalindromenaive {
 static int minDelRecu(int i,int j,String str){
    if(i>=j)
    return 0;
    if(str.charAt(i)==str.charAt(j)){
return minDelRecu(i+1,j-1,str);
    }
    return 1+Math.min(minDelRecu(i+1,j,str),minDelRecu(i,j-1,str));
 }  
 static int minDeletion(String str){
    int n=str.length();
    return minDelRecu(0,n-1,str);
 } 
 public static void main(String args[]){
String str="aebcbda";
System.out.println(minDeletion(str));
 }
}
