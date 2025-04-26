import java.util.Scanner;
public class Str1palindromecheck {
  static boolean palindrome(String str) {
    int left=0;
    int right=str.length()-1;
    while(left<right){
        if(str.charAt(left)!=str.charAt(right))
        return false;
            left++;
            right--;
    }
    return true ;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String : ");
    String str=sc.nextLine();
    sc.close();
    System.out.println(palindrome(str));
  }
}
