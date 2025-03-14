import java.util.Scanner;
public class strkmpconstructlpsnaive {
  static int longpropresuff(String str,int n){
    for(int len=n-1;len>0;len--){
        boolean flag=true;
        for(int i=0;i<len;i++)
        if(str.charAt(i)!=str.charAt(n-len+i))
        flag=false;
        if(flag==true)
        return len;
    }
    return 0;
  }  
  static void filllps(String str,int lps[]){
    for(int i=0;i<str.length();i++){
    lps[i]=longpropresuff(str,i+1);
  }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    sc.close();
    int lps[]=new int[str.length()];
    filllps(str,lps);
    for(int i=0;i<str.length();i++){
        System.out.print(lps[i]+" ");
    }
}
}
