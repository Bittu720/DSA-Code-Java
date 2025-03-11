import java.util.Scanner;
public class strconcte{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter first string : ");
   String str1=sc.nextLine();
   System.out.print("enter second string : ");
   String str2=sc.nextLine();
   sc.close();
   System.out.println(str1.concat(str2));
   } 
}

