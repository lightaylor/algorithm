import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Album> albumList = new HashMap();
        Map<Integer, Integer> map;
        Album album;

        for (int i = 0; i < genres.length; i++) {
            if (albumList.get(genres[i]) != null) {
                album = albumList.get(genres[i]);
                map = album.getMap();
                map.put(i, plays[i]);
                album.setTotal(plays[i]);
            } else {
                map = new HashMap();
                map.put(i, plays[i]);
                album = new Album(map, plays[i]);
            }
            albumList.put(genres[i], album);
        }

        for (String key : albumList.keySet()) {
            album = albumList.get(key);
            map = album.getMap();
        }
        answer = sort(albumList);
        return answer;
    }

    public int[] sort(Map<String, Album> albumList) {
        String[] list = albumList.keySet().toArray(new String[albumList.size()]);
        int[] answer = new int[albumList.size() * 2];
        Map<Integer, Integer> map;
        String temp;
        int intTemp;
        int k = 0;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (albumList.get(list[j]).getTotal() < albumList.get(list[j + 1]).getTotal()) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            map = albumList.get(list[i]).getMap();
            Integer[] value = map.keySet().toArray(new Integer[map.size()]);
            for (int j = 0; j < value.length - 1; j++) {
                for (int t = 0; t < value.length - 1 - j; t++) {
                    if (map.get(value[t]) < map.get(value[t + 1])) {
                        intTemp = value[t];
                        value[t] = value[t + 1];
                        value[t + 1] = intTemp;
                    }
                }
            }
            answer[k++] = value[0];
            if (value.length > 1) {
                answer[k++] = value[1];
            } else {
                int[] newAnswer = new int[answer.length - 1];
                for(int t = 0; t < answer.length-1; t++) {
                    newAnswer[t] = answer[t];
                }
                answer = newAnswer;
            }
        }
        return answer;
    }
}

class Album {
    private Map<Integer, Integer> map;
    private int total;

    public Album(Map<Integer, Integer> map, int total) {
        this.map = map;
        this.total = total;
    }

    public void setTotal(int num) {
        this.total += num;
    }

    public int getTotal() {
        return total;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return total + " " + map.toString();
    }
}