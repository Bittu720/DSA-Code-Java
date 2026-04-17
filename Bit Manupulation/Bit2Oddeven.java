public class Bit2oddeven {
    public static void oddeven(int n){
        int bitMask=1;
        if((n& bitMask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddeven(5);
    }
}
