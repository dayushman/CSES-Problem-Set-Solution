package IntroductoryProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = Integer.parseInt(sc.next());

        BigInteger num = new BigInteger(String.valueOf(inp));


        while (num.intValue()!=1){
            System.out.print(num+" ");
            if(num.intValue() %2 == 0){
                num = num.divide(BigInteger.valueOf(2));
            }
            else{
                num = num.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
            }
        }
        System.out.print(1);
    }
}
