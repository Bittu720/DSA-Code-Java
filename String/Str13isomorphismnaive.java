public class Str13isomorphismnaive {
  public static boolean Isomorphism(String str1,String str2){
    if(str1.length()!=str2.length())
    return false;  
  int map1[]=new int[256];
  int map2[]=new int[256];
  for(int i=0;i<str1.length();i++){
    char char1=str1.charAt(i);
    char char2=str2.charAt(i);
    if(map1[char1]!=0 && map1[char1]!=char2){
        return false;
    }
    if (map2[char2] != 0 && map2[char2] != char1) {
        return false;
    }
        map1[char1] = char2;
            map2[char2] = char1;
  }
  return true;
}
public static void main(String args[]){
    System.out.println(Isomorphism("aab","xxy")?"True":"False");
    System.out.println(Isomorphism("foo","bar")?"True":"false");
}
}
