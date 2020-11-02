package IntroductoryProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.next());
        long[] num = new long[size];
        for (int i = 0; i < size; i++) {
            num[i] = Long.parseLong(sc.next());
        }

        long limit = num[0];
        BigInteger ans = new BigInteger(String.valueOf(0));
        for (int i = 1; i < size; i++) {
            if (num[i] < limit){
                ans = ans.add(BigInteger.valueOf(limit - num[i]));
            }
            else{
                limit = num[i];
            }
        }
        System.out.println(ans);
    }
}
