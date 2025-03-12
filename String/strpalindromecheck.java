import java.util.Scanner;
public class strpalindromecheck {
    public static boolean palindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter string : ");
    String str=sc.nextLine();
    sc.close();
    if(palindrome(str)){
        System.out.println(str+" "+"is palidrome");
    }
    else{
        System.out.println(str+" "+"is not palindrome");
    }
    }
}
