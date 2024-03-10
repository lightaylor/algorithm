class Solution {
    public String[] solution(String my_string) {
        String temp = my_string.strip();

        while(temp.contains("  ")) {
            temp = temp.replaceAll("  ", " ");
        }

        return temp.split(" ");
    }
}
