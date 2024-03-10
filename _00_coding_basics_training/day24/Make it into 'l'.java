import java.util.*;

class Solution {
    public String solution(String myString) {
        String regex = "([a-k])";
        String answer = myString.replaceAll(regex, "l");

        return answer;
    }
}
