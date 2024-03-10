class Solution {
    public String solution(String polynomial) {
        String[] operand = polynomial.split(" ");
        String answer = "";
        int x = 0;
        int y = 0;

        for (String str : operand) {
            if (!str.equals("+")) {
                if (str.contains("x")) {
                    x += str.charAt(0) == 'x' ? 1 : Integer.parseInt(str.replace("x", ""));
                }
                y += str.contains("x") ? 0 : Integer.parseInt(str);
            }
        }

        if (x > 0) {
            answer = (x > 1 ? x : "") + "x";
        }
        if (y > 0) {
            answer += answer.length() > 0 ? " + " : "";
            answer += y + "";
        }

        return answer;
    }
}
