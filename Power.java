
class Power{
    public static int pow(int n,int k){
        if(k==0){
            return 1;
        }
        int temp =pow(n,k/2);
        temp = temp*temp;
        if(k%2==0){
            return temp;
        }
        else{
            return temp*n;
        }
    }
    public static void main(String args[]){
        int n=5;
        int k=3;
        System.out.print(pow(n,k));
    }
}