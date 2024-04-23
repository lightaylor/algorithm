package practice_exercise.sort_strings_according_to_my_will;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<String, List> map = new HashMap<>();
        Arrays.sort(strings);
        List<String> list;

        for (int i = 0; i < strings.length; i++) {
            answer[i] = Character.toString(strings[i].charAt(n));
            if (map.containsKey(answer[i] )) {
                list = map.get(answer[i] );
                list.add(strings[i]);
                map.put(answer[i] , list);
            } else {
                list = new ArrayList<String>();
                list.add(strings[i]);
                map.put(answer[i], list);
            }
        }

        Arrays.sort(answer);
        for(int j = 0; j < answer.length; j++) {
            list = map.get(answer[j]);
            for (String str : list) {
                answer[j++] = str;
            }
            j--;
        }

        return answer;
    }
}
