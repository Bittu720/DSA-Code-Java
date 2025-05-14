public class Str40checkstringisInterleavingofothertwonaive {
   static boolean isILRec(String str1,String str2,String str3,int i,int j){
    int k=i+j;
    if(i==str1.length()&& j==str2.length()&&k==str3.length())
return true;
 boolean a = (i < str1.length())
                    && (str3.charAt(k) == str1.charAt(i))
                    && isILRec(str1, str2, str3, i + 1, j);
        boolean b = (j < str2.length())
                    && (str3.charAt(k) == str2.charAt(j))
                    && isILRec(str1, str2, str3, i, j + 1);
                    return a||b;
   } 
   static boolean isInterleave(String str1,String str2,String str3){
     if (str1.length() + str2.length() != str3.length())
            return false;

        return isILRec(str1, str2, str3, 0, 0);
    }
    public static void main(String[] args)
    {
        String str1 = "AAB";
        String str2 = "AAC";
        String str3 = "AAAABC";
        System.out.println(
            isInterleave(str1, str2, str3) ? "true" : "false");
    }
   }

