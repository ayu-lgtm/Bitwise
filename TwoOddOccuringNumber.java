public class TwoOddOccuringNumber {
    public static void main(String args[]){
        int arr[]={3,4,3,4,5,4,4,6,7,7};

        int res=0;
        for(int x:arr){
            res^=x;
        }
        
        int sn = res&~(res-1);
        //System.out.println(sn);

        int res1=0,res2=0;
        for(int i=0;i<arr.length;i++){
            //System.out.print((arr[i]&sn)+" ");
            if((arr[i]&sn)!=0){
                res1^=arr[i];
            }
            else{
                res2^=arr[i];
            }
        }

        System.out.print(res1+" "+res2);


    }
}
