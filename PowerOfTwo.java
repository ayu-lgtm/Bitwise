public class PowerOfTwo {
    public static boolean check(int n){
        return (n!=0) && (n/2)%2==0;
    }
    public static void main(String args[]){
        int number = 6;
        System.out.print(check(number));
    }
}
