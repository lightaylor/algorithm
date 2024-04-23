package baekjoon.test_2775;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int total = sc.nextInt();

        for(int i = 0; i < total; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            list.add(resident(k, n));
        }

        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }

    public static int resident(int k, int n) {
        for(int i = 0;  i<= k; i++) {

        }
    }
}
