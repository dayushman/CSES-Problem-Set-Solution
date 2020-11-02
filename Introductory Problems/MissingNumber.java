package IntroductoryProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] map = new int[n];
        Arrays.fill(map,-1);
        for (int i = 0; i < n-1; i++) {
            int num = Integer.parseInt(sc.next());
            map[num-1] = 0;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (map[i] == -1){
                ans = i+1;
                break;
            }
        }
        System.out.println(ans);
    }
}
