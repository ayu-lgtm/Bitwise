public class CheckKthBit {
    public static void main(String args[]){
        int num=0;
        int k=3;//from right hand side

        //naive method
        /*System.out.print(num+" ");
        if(num%2==0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
        k--;
        while(num>0 && k>0){
            num=num>>1;
            System.out.print(num+" ");
            if(num%2==0){
                System.out.println("Bit is 0");
            }
            else{
                System.out.println("Bit is 1");
            }
            k--;
        }*/

        /*if((num & (1<<(k-1)))!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/

        if(((1>>(k-1))&num)!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    
}
