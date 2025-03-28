import java.util.Scanner;
public class strcheckanagramfoundeff {
    static final int CHAR=256;
    static boolean Same(int CT[],int CP[]){
        for(int i=0;i<CHAR;i++){
            if(CT[i]!=CP[i])
            return false;
        }
        return true;
    }
    static boolean present(String txt,String pat){
        int CT[]=new int[CHAR];
        int CP[]=new int[CHAR];
        for(int i=0;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CT[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(Same(CT,CP))
            return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter  string : ");
    String txt=sc.nextLine();
    System.out.print("enter pattern : ");
    String pat=sc.nextLine();
    sc.close();
    if(present(txt,pat))
    System.out.println("anagram is found");
    else
    System.out.print("anagram is not found");
}
}
