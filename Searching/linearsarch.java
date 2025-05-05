import java.util.Scanner;
public class linearsearch{
    static int search(int arr[],int n,int x){
     for(int i=0;i<n;i++){
        if(arr[i]==x)
        return arr[i];
     }
     return -1;
    }
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("enter size of array :");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter number :");
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println("enter search element :");
     int x=sc.nextInt();
     int result=search(arr,n,x);
if(result!=-1){
    System.out.println("value="+result);
}
else{
    System.out.println("not found");
}
sc.close();
    }
}
