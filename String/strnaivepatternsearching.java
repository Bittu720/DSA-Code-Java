import java.util.Scanner;
public class strnaivepatternsearching {
   static void patsearching(String txt,String pat){
    int m=pat.length();
    int n=txt.length();
    for(int i=0;i<=(n-m);i++){
        int j;
        for(j=0;j<m;j++)
        if(pat.charAt(j)!=txt.charAt(i+j))
        break;
        if(j==m)
        System.out.print(i+" ");
    }
   } 
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter first string : ");
   String txt=sc.nextLine();
   System.out.print("enter second string : ");
   String pat=sc.nextLine();
   sc.close();
   patsearching(txt,pat);
   } 
}
