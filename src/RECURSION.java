import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class RECURSION {

     static  int SUM(int N){
        if(N==1){
            return 1;
        }
        int temp =SUM(N-1);
        return temp + N;       // return temp * N; for factorial
    }

    static int FAB(int N){
         if(N==0 || N == 1){
             return N;
         }
         int temp1 = FAB(N-1);
         int temp2 = FAB(N-2);

         return temp1+temp2;
    }

//    static int POW(int N,int M){
//         if (M == 1) {
//             return N;
//         }
//          int temp = POW(N,M-1);
//          return temp*N;
//    }
    static int POW(int N,int M){
         if(M==1){
             return N;
         }
         // if(M<0) return  (1/POW(N,-M));
         int temp = POW(N,M/2);
         if(M%2==0) return temp*temp;
         return temp*temp*N;


    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(SUM(N));
        System.out.println(FAB(N));
        System.out.println(POW(N,M));

    }
}
