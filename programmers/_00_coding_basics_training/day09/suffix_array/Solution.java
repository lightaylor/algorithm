package _00_coding_basics_training.day09.suffix_array;

import java.util.*;

class Solution {
    public String[] main(String my_string) {
        String[] answer = new String[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.substring(my_string.length() - i - 1, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
}
