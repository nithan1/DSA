public class REVERSE_VOWELS {
    
    public static void main(String[] args) {
        String s = "nithan";
        reverse(s);
    }


    private static void reverse(String s) {
        int i = 0;
        int j = s.length()-1;
       char [] e = s.toCharArray();

       while(i<j){
           while(e[i]!='a' && e[i]!='e'&& e[i]!='i' && e[i]!='o'&& e[i]!='u'){
               i++;
           }
           while(e[j]!='a' && e[j]!='e'&& e[j]!='i' && e[j]!='o'&& e[j]!='u'){
               j--;
           }

           if (i>=j){
               break;
           }

           char ch =e[i];
           e[i]=e[j];
           e[j]=ch;
           i++;
           j--;

       }
       for (char ch:e){
           System.out.print(ch);
       }

    }
}
