package IntroductoryProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        int largestLength = 1;
        ArrayList<Character> set = new ArrayList<>();
        set.add(given.charAt(0));
        for (int i = 1; i < given.length(); i++) {

            if (given.charAt(i) != given.charAt(i-1)){
                if (largestLength < set.size())
                    largestLength = set.size();
                set.clear();
            }
            set.add(given.charAt(i));
        }
        if (largestLength < set.size())
            largestLength = set.size();
        set.clear();
        System.out.println(largestLength);
    }
}
