import java.util.*;
public class Mat2searchkey {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                System.out.println("found at index ("+i+","+j+")");
                return true;
    }
    System.out.println();
}
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        search(matrix,5);
    }
}
  

