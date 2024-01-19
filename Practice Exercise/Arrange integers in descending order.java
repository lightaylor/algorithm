import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] c =  String.valueOf(n).toCharArray();
        String temp = "";
        Arrays.sort(c);

        for (int i = c.length - 1; i >= 0; i--) {
            temp += c[i];
        }

        return Long.parseLong(temp);
    }
}