public class OOPs1 {
  public static void main(String args[]){
 Pen p=new Pen();
 p.setColor("blue");
 System.out.println(p.color);

 BankAccount myAcc=new BankAccount();
  myAcc.username="bittu";
  // myAcc.password="@1234";
  System.out.println(myAcc.username);

}  
}

class Pen{
    String color;
    void setColor(String newColor){
        color=newColor;
    }
}

class BankAccount{
    public String username;
    // private String password;
    
}