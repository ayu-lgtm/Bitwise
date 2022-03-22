public class PalindromeNumber {
    public static boolean function(int p){
        int reverse=0;
        int n=p;
        while(n!=0){
            int t = n%10;
            reverse = reverse*10+t;
            n = n/10;
        }

        System.out.println(reverse);

        return (reverse==p);
    }
    public static void main(String args[]){
        int number =9999;
        System.out.println(function(number));
    }
}
