public class Rec3 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        //int fact1=factorial(n-1);
        int factn=n*factorial(n-1);
        return factn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(factorial(n));
    }

}
