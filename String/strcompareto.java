public class strcompareto {
   public static void main(String args[]){
    String str1="kushwaha";
    String str2="bittukushwaha";
    int res=str1.compareTo(str2);
    if(res==0)
    System.out.println("same");
    if(res>0)
    System.out.println("str1 is less");
    if(res<0)
    System.out.println("str1 is greater");
   } 
}
