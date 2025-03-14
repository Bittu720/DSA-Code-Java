import java.util.Scanner;
public class strkmplpsmatchcom {
  static void filllps(String str,int lps[]){
    int n=str.length();
    int len=0;
    int i=1;
    while(i<n){
        if(str.charAt(i)==str.charAt(len)){
            len++;
            lps[i]=len;
            i++;
        }
        else{
            if(len==0){
                lps[i]=0;
                i++;
            }
            else{
                len=lps[len-1];
            }
        }
    }
  }  
  static void kmp(String pat,String txt){
    int N=txt.length();
    int M=pat.length();
    int lps[]=new int[M];
    filllps(pat,lps);
    int i=0,j=0;
    while(i<N){
        if(pat.charAt(j)==txt.charAt(i)){
            i++;
            j++;
        }
        if(j==M){
            System.out.println("found pattern in index"+(i-j));
            j=lps[j-1];
        }
        else if(i<N && pat.charAt(j)!=txt.charAt(i)){
         if(j==0)
         i++;
         else
         j=lps[j-1];   
        }
    }
  }
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string : ");
        String txt=sc.nextLine();
        System.out.println("enter pattern : ");
        String pat=sc.nextLine();
        sc.close();
        kmp(pat,txt);
     }  
}
