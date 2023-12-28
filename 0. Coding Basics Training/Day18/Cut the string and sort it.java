import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        answer = Arrays.stream(answer).filter(element -> element.length() != 0).toArray(String[]::new);
        return answer;
    }
}
