public class LongestConsecutive1 {

    public static void longestConsecutive1(int num){
        //System.out.print("hello");
        int c=0;
        int max=0;
        while(num>0){
            if((num&1)==1){
                c++;
            }
            max=Math.max(c,max);
            if((num&1)==0){
                c=0;
            }
            
            num=num>>1;
            //System.out.println(num+" "+max);
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        int num = 14;
        longestConsecutive1(num);
    }
}
