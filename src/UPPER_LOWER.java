public class UPPER_LOWER {
    public static void main(String[] args) {
        String A = "NITHAN";
        String b = "nithan";
        LOWER(A);
        UPPER(b);
    }

    private static void UPPER(String b) {
        String c = b.toUpperCase();
        System.out.println(c);
    }

    private static void LOWER(String A) {

            String B = A.toLowerCase();
            System.out.println(B);



    }
}
