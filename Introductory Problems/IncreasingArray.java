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
        
        for (int i = 0; i < size - 1; i++) {
            num[i] = num[i+1] - num[i];
        }
        BigInteger ans = new BigInteger(String.valueOf(0));
        for (int i = 0; i < size - 1; i++) {
            if (num[i] > 0)
                ans = ans.add(BigInteger.valueOf(num[i]));
        }
        System.out.println(ans.intValue());
    }
}
