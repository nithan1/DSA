public class REMOVE_VOWELS {
    public static void remove(String s) {
        for (int i =0;i<s.length();i++){
            char e = s.charAt(i);
            if(e == 'a' || e == 'e'|| e == 'i'|| e == 'o'|| e == 'u'){
                continue;
            }
            System.out.print(e);
        }

    }
    public static void main(String[] args) {
        String s = "nithan";
        remove(s);

    }
}
