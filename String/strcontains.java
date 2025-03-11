import java.util.Scanner;
public class strcontains {
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter first string : ");
   String str1=sc.nextLine();
   System.out.print("enter second string : ");
   String str2=sc.nextLine();
   System.out.println("enter third string : ");
  String str3=sc.nextLine();
   sc.close();
   if(str1==str2)
   System.out.println("yes");
  else
    System.out.println("no");
   if(str1==str3)
   System.out.println("yes");
   else
   System.out.println("no");
   } 
}

