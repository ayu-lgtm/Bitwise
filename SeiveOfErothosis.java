import java.util.*;

public class SeiveOfErothosis {
    public static void main(String args[]){
        int num =25;
        boolean b[]=new boolean[num+1];
        Arrays.fill(b,true);

        if(num<=1)return;

        for(int i=2;i*i<=num;i++){
            if(b[i]){
                for(int j=2*i;j<=num;j=j+i){
                    b[j]=false;
                }
                
            }
        }

        for(int i=2;i<=num;i++){
            if(b[i]){
                System.out.print(i+" ");
            }
        }
    }
}
