import java.util.Arrays;
import java.util.Scanner;

public class REVERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        int[] ans = new int [n];

        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        for (int i = arr.length-1;i>=0;i--){
//            ans[arr.length-1-i]=arr[i];
//        }
//        System.out.println(Arrays.toString(ans));


        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
             arr[i] =  arr[j];
             arr[j] = temp;
             i++;
             j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
