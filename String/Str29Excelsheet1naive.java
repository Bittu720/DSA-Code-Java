public class Str29Excelsheet1naive {
    static String colName(int n){
        StringBuilder res=new StringBuilder();
        while(n>0){
            int rem=n%26;
            if(rem==0){
                res.append('Z');
                n=(n/26)-1;
            }
            else{
                res.append((char)((rem-1)+'A'));
                n=n/26;
            }
        }
        res.reverse();
        return res.toString();
    }
    public static void main(String args[]){
        int n=702;
        System.out.println(colName(n));
    }
}
