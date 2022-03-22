public class CheckPowerOfTwo {
    public static boolean  check(int n){
        if(n==0)return false;
        else return (n&(n-1))==0;
    }
    public static void main(String args[]){
        int num = 32;
        System.out.print(check(num));
    }
}
