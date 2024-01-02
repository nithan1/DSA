public class kth {
    static void q(int n,int k){
        int x = (n>>(k-1));
        if((x&1)!=0){
            System.out.println("yes"); ;
        }else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        int n =10;
        int k =3;
        q(n,k);
    }
}
