package sort.the_largest_number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();

        for (int number : numbers) list.add(String.valueOf(number));
        list.sort((a, b) -> (b + a).compareTo(a + b));

        if (list.getFirst().charAt(0) == '0') return "0";

        StringBuilder sb = new StringBuilder();
        for (String number : list) sb.append(number);

        return sb.toString();
    }
}
