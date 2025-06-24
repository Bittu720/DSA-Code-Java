public class OOPs2 {
   public static void main(String args[]){
    Student s1=new Student();
     s1.name="bittu";
     s1.roll=15;

    System.out.println(s1.name);
     System.out.println(s1.roll);
    //System.out.println(s1.Student());
   // Student s2=new Student("bittu");
   // Student s3=new Student(123);
   } 
}
class Student{
    String name;
    int roll;
    int age;
    Student(){
        //this.age=age;
System.out.println("Bittu kushwaha");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}