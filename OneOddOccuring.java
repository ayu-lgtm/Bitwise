public class OneOddOccuring {
    public static void main(String args[]){
        int arr[]={1,2,3,4,1,2,3};

        int res=0;

        for(int x:arr){
            res^=x;
        }

        System.out.println(res);
    }
}
