import java.util.Scanner;

public class strleftmostnonrepnaive {
    static int nonrep(String str){
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    flag =true;
                    break;
                }
            }
            if(flag==false)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string : ");
        String str=sc.nextLine();
        sc.close();
        System.out.print("index of left most repeating character:");
        System.out.print(nonrep(str));
     } 
}
