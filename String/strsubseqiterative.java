import java.util.Scanner;
public class strsubseqiterative {
 public static boolean subseq(String str1,String str2,int n,int m){
    int j=0;
    for(int i=0;i<n && j<m;i++){
        if(str1.charAt(i)==str2.charAt(j))
        j++;
    }
    return j==m;
 }  
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter size of string 1 : ");
   int n=sc.nextInt();
   sc.nextLine();
   System.out.print("enter string 1 : ");
   String str1=sc.nextLine();
    System.out.print("enter size of string 2 : ");
   int m=sc.nextInt();
   sc.nextLine();
    System.out.print("enter string 2 : ");
    String str2=sc.nextLine();
    sc.close();
    System.out.println(subseq(str1,str2,n,m));
 } 
}
