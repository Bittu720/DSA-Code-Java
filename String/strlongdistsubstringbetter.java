import java.util.Scanner;

public class strlongdistsubstringbetter {
 static int longestDistinct(String str){
    int n=str.length();
    int res=0;
    for(int i=0;i<n;i++){
        boolean visited[]=new boolean[256];
        for(int j=i;j<n;j++){
            if(visited[str.charAt(j)]==true){
                break;
            }
            else{
                res=Math.max(res,j-i+1);
                visited[str.charAt(j)]=true;
            }
        }
    }
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
