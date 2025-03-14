import java.util.Scanner;

public class strkmplpsconstructeff {
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
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string : ");
    String str=sc.nextLine();
    sc.close();
    int lps[]=new int[str.length()];
    filllps(str,lps);
    for(int i=0;i<str.length();i++){
        System.out.print(lps[i]+" ");
    }
}  
}
