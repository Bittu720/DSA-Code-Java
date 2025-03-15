import java.util.Scanner;

public class strcheckanagramfoundnaive {
   static final int CHAR=256;
   static boolean Anagram(String pat,String txt,int i){
    int count[]=new int[CHAR];
    for(int j=0;j<pat.length();j++){
        count[pat.charAt(j)]++;
        count[txt.charAt(i+j)]--;
    }
    for(int j=0;j<CHAR;j++){
        if(count[j]!=0)
        return false;
    }
    return true;
   } 
   static boolean present(String txt,String pat){
    int n=txt.length();
    int m=pat.length();
    for(int i=0;i<=n-m;i++){
        if(Anagram(pat,txt,i))
        return true;
    }
    return false;
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.print("enter first string : ");
   String txt=sc.nextLine();
   System.out.print("enter second string : ");
   String pat=sc.nextLine();
   sc.close();
   if(present(txt,pat))
   System.out.println("anagram is found");
   else
   System.out.print("anagram is not found");
   }
}
