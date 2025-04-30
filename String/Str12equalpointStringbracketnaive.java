public class Str12equalpointStringbracketnaive {
    public static int findeqlPoint(String str){
      int n = str.length();
      for (int i = 0; i < n; i++) {
          int openCnt = 0, closeCnt = 0;
          for (int j = 0; j < i; j++) {
              if (str.charAt(j) == '(') {
                  openCnt++;
              }
          }
          for (int j = i; j < n; j++) {
              if (str.charAt(j) == ')') {
                  closeCnt++;
              }
          }
          if (openCnt == closeCnt) {
              return i;
          }
      }
      return -1; 
    }  
    public static void main(String args[]){
      String str = "(())))(";
      System.out.println(findeqlPoint(str)); 
    }
  }
  