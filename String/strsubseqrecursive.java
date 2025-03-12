import java.util.Scanner;
public class strsubseqrecursive {
    public static boolean subseq(String str1,String str2,int n,int m){
        if(m==0)
        return true;
        if(n==0)
        return false;
        if(str1.charAt(n-1)==str2.charAt(m-1))
        return subseq(str1,str2,n-1,m-1);
        else
        return subseq(str1,str2,n-1,m);
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

