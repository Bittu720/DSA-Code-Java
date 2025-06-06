public class Pattern5hollowrectangle {
    public static void hollow_rectangle(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||j==1||j==cols||i==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(5,5);
    }
}
