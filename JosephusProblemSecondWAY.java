//import java.util.*;

public class JosephusProblemSecondWAY {
    public static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        return (jos(n-1,k)+k)%n;

    }
    public static void main(String args[]){
        int n=7;
        int k=3;

        /*List<Integer> l = new ArrayList<>();

        for(int i=0;i<n;i++){
            l.add(i);
        }

        Iterator<Integer> I = l.iterator();

        while(l.size()>1){
            int count=0;
            while(count<k){
                while(count<k && I.hasNext()==true){
                    I.next();
                    count++;
                }
                if(count<k){
                    I=l.iterator();
                    I.next();
                    count++;
                }
            }
            I.remove();
        }

        System.out.print(l.get(0));
        */

        //second way
        System.out.print(jos(n,k));//       0(n)

    }
}
