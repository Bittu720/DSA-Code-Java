import java.util.Scanner;
public class strleftmostrepeatnaive {
 static int leftmost(String str){
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j))
            return i;
        }
    }
    return -1;
 }  
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter string : ");
    String str=sc.nextLine();
    sc.close();
    System.out.print("index of left most repeating character:");
    System.out.print(leftmost(str));
 } 
}
