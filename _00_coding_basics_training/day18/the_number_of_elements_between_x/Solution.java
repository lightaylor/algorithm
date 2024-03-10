package _00_coding_basics_training.day18.the_number_of_elements_between_x;

import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x");
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int j = 0; j < myString.length(); j++) {
            if (myString.charAt(j) == 'x') {
                list.add(count);
                count = 0;
            }
            else
                count++;
        }
        list.add(count);

        int[] i = new int[list.size()];
        for(int j = 0; j < i.length; j++) {
            i[j] = list.get(j);
        }

        return i;
    }
}
