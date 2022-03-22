import java.util.*;

public class SumSubset {
    /*public static void sumsubset(int arr[],int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return sumsubset(arr,n-1,sum)+sumsubset(arr,n-1,sum-arr[n-1]);
    }*/

    //print subset
    public static void sumsubsetx(int arr[],ArrayList<ArrayList<Integer>> al){
        int n=arr.length;
        int powr = (int) Math.pow(2,n);
        for(int i=0;i<powr;i++){
            al.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if((i&(1<<(j)))!=0){
                    al.get(i).add(arr[j]);
                }
            }
        }

        for(ArrayList<Integer> x:al){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        //int sum =5;
        //System.out.print(sumsubset(arr,arr.length,sum));

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        sumsubsetx(arr,al);
    }
}
