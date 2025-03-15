import java.util.Scanner;
public class strcheckstringrotations {
   public static boolean rotation(String str1,String str2){
    if(str1.length()!=str2.length()){
        return false;
    }
    String temp=str1+str1;
    return temp.indexOf(str2)!=-1;
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first string : ");
    String str1=sc.nextLine();
    System.out.print("enter first string : ");
    String str2=sc.nextLine();
    sc.close();
    System.out.print(rotation(str1,str2));
   } 
}
