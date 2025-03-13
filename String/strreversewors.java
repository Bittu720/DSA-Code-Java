import java.util.Scanner;

public class strreversewors {
   static void reverse(char str[],int low, int high){
    while(low<=high){
        char temp=str[low];
        str[low]=str[high];
        str[high]=temp;
        low++;
        high--;
    }
   } 
   static void reverseword(char str[],int n){
    int start=0;
    for(int end=0;end<n;end++){
        if(str[end]==' '){
            reverse(str,start,end-1);
            start=end+1;
        }
    }
    reverse(str,start,n-1);
    reverse(str,0,n-1);
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter string : ");
    String st=sc.nextLine();
    sc.close();
    char str[]=st.toCharArray();
    int n=str.length;
    reverseword(str,n);
    System.out.print("after reversing the string : "+new String(str));
 } 
}
