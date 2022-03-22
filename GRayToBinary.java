public class GRayToBinary {
    public static void GrayToBinary(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans ^ n;
            n = n >> 1;
        }
        System.out.print(ans);
    }

    public static int BinaryTogray(int n) {
        return n ^ (n >> 1);
    }

    public static void main(String args[]) {
        int num = 2;
        GrayToBinary(num);
        System.out.println();
        //System.out.print(BinaryTogray(num));

    }
}
