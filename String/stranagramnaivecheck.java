import java.util.Scanner;
import java.util.Arrays;
public class stranagramnaivecheck {
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length())
        return false;
        char A1[]=str1.toCharArray();
        Arrays.sort(A1);
        str1=new String(A1);
        char A2[]=str2.toCharArray();
        Arrays.sort(A2);
        str2=new String(A2);
        return str1.equals(str2);
    }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.print("enter string 1 : ");
   String str1=sc.nextLine();
    System.out.print("enter string 2 : ");
    String str2=sc.nextLine();
    sc.close();
    if(anagram(str1,str2))
    System.out.println("the two strings are"+"anagram of each other");
    else
    System.out.println("the two strings are not"+"anagram of each other");
 } 
}   

