import java.util.ArrayList;
public class Arraylist3Maximuminarr {
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){

            // max=Math.max(max,list.get(i));

            if(max<list.get(i)){
                max=list.get(i);
            }
        }
System.out.println("max element = "+max);
    }
}
