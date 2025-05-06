public class Str20largestwordindictionarynaive {
  public static boolean isSubsequence(String d,String s){
    int i=0,j=0;
    while(i<d.length()&&j<s.length()){
        if(d.charAt(i)==s.charAt(j)){
            i++;
        }
        j++;
    }
    return i==d.length();
  } 
  public static String longestWord(String d[],String S){
    String res="";
    java.util.Arrays.sort(d);
    for(String word:d){
        if(isSubsequence(word,S)){
            if(word.length()>res.length()||(word.length()==res.length()&& word.compareTo(res)<0)){
                res=word;
            }
        }
    }
    return res;
  } 
  public static void main(String args[]){
    String dict[]={"ale","apple","monkey","plea"};
    String str="abpcplea";
    System.out.println(longestWord(dict,str));
  }
}
