public class PowerSet {
    /*public static void sset(String s,String res,int l){
        if(s.length()==l){
            System.out.print("{"+res+"} ");
            return;
        }
        sset(s,res,l+1);
        sset(s,res+s.charAt(l),l+1);

    }*/

    public static void BitwiseMethod(String s){
        int l = s.length();

        int POW = (int)Math.pow(2,l);

        for(int c=0;c<POW;c++){
            System.out.print("{");
            for(int j=0;j<l;j++){
                if((c&(1<<j))!=0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print("},");
        }

    }

    
    public static void main(String args[]){
        String s="abc";
        //sset(s,"",0);
        BitwiseMethod(s);
    }
}
