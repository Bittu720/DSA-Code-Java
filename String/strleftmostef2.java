import java.util.Scanner;
public class strleftmostef2 {
    static final int CHAR = 256;
    static int leftmost(String str) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)]) {
                res = i;
            } else{
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.print("Index of leftmost repeating character: ");
        System.out.println(leftmost(str));
    }
}