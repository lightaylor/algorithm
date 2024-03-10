package coding_basics_training.day01.print_the_string_repeatedly;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
