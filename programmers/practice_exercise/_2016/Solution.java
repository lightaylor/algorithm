package programmers.practice_exercise._2016;

import java.text.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            Date today = dateFormat.parse("2016." + a + "." + b);

            DateFormat dayFormat = new SimpleDateFormat("E");
            String dayOfWeek = dayFormat.format(today);

            return dayOfWeek.toUpperCase();
        } catch (Exception e) {
            return "";
        }
    }
}
