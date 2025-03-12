import java.util.Scanner;

public class stranagramrecursive {
    static final int CHAR=256;
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length())
        return false;
        int count[]=new int[CHAR];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0)
            return false;
        }
        return true;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.print("enter string 1 : ");
   String str1=sc.nextLine();
    System.out.print("enter string 2 : ");
    String str2=sc.nextLine();
    sc.close();
    if(anagram(str1,str2))
    System.out.println("the two strings are"+"anagram of each other");
    else
    System.out.println("the two strings are not"+"anagram of each other");
 }  
}
