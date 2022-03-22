public class FindMissing {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7};

        int res=1;

        for(int i=2;i<=arr.length+1;i++){
            res^=i;
        }

        for(int x:arr){
            res^=x;
        }

        System.out.print(res);
    }
}
