import java.util.Scanner;
public class Countdigits{
 static int Counts(int number){
    int count=0;
    while(number>0){
        number=number/10;
        count++;
    }
    return count;
 }  
 public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter number : ");
int number=sc.nextInt();
System.out.println("Digit = "+Counts(number));
sc.close();
 } 
}

