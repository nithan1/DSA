public class TOWER_FO_HOWAI {
    static void TOH(int n,char a, char b,char c){
        if(n==1){
            System.out.println("move 1 from "+a +" to " +c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("move "+n+" from "+a+" to "+c);
        TOH(n-1,b,a,c);
    }

    public static void main(String[] args) {
        int n=2;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        TOH(n,a,b,c);
    }

}
