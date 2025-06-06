import java.util.Scanner;
public class Str3reverseword {
    static void reverse(char str[], int low, int high) {
        while (low <= high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    static void reverseWord(char str[], int n) {
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == ' ') {
                reverse(str, start, i - 1);
                start = i + 1;
            }
        }
        reverse(str, start, n - 1);  
        reverse(str, 0, n - 1);      
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String st = sc.nextLine();
        sc.close();

        char str[] = st.toCharArray();
        int n = str.length;
        reverseWord(str, n);
        System.out.println("After reversing the string: " + new String(str));
    }
}
