

public class Permutation {
    public static void permutation(StringBuffer s,int i){
        if(i==s.length()){
            System.out.print(s+" ");
            return;
        }
        for(int j=i;j<s.length();j++){
               swap(s,i,j);
               permutation(s, i+1);
               swap(s,i,j);
        }

    }
    public static void swap(StringBuffer s,int i,int j){
        char a=s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, a);
    }
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("ABC");
        int i=0;
        permutation(s,i);
    }
}
