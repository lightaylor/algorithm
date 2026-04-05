package programmers._2019_kakao_blind_recruitment.open_chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String r : record) {
            String[] s = r.split(" ");
            if (!s[0].equals("Leave")) map.put(s[1], s[2]);
        }

        for (String r : record) {
            String[] s = r.split(" ");
            switch (s[0]) {
                case "Enter" -> list.add(map.get(s[1]) + "님이 들어왔습니다.");
                case "Leave" -> list.add(map.get(s[1]) + "님이 나갔습니다.");
            }
        }

        return list.toArray(new String[0]);
    }
}
