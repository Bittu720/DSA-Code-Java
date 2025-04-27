public class Str5firstnonrepeatnaive {
   public static char nonRepeat(String str){
    int n=str.length();
    for(int i=0;i<n;i++){
        boolean found =false;
        for(int j=0;j<n;j++){
            if(i!=j && str.charAt(i)==str.charAt(j)){
                found =true;
                break;
            }
        }
        if(!found)
        return str.charAt(i);
    }
    return '$';
   } 
   public static void main(String args[]){
    String str="racecar";
    System.out.println(nonRepeat(str));
   }
}
