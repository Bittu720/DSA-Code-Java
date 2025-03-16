import java.util.Scanner;
public class strlongestsubstringdistcharnaive {
    static boolean Distinct(String str,int i,int j){
        boolean visited[]=new boolean[256];
        for(int k=i;k<=j;k++){
            if(visited[str.charAt(k)]==true)
            return false;
            visited[str.charAt(k)]=true;
        }
        return true;
    }
    static int longestDistinct(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++)
        for(int j=i;j<n;j++)
        if(Distinct(str,i,j))
        res=Math.max(res,j-i+1);
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int len=longestDistinct(str);
        System.out.print("the length of longest distinct character substring : "+len);
    }
}
