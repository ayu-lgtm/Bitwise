public class LuckyNumber {
    public static int count=2;
    public static boolean isLucky(int n){
        if(n<count)return false;
        if(n%count==0)return false;
        else{
            n=n-n/count;
            count++;
            return isLucky(n);
        }

    }
    public static void main(String args[]){
        System.out.print(isLucky(10));
    }
}
