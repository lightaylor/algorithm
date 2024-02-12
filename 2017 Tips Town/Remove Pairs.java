class Solution
{
    public int solution(String s)
    {
        int i = 0;

        while(0 < s.length() && i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i+1)) {
                String temp = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                s = s.replace(temp, "");
                if (i-1 >= 0) i--;
            } else {
                i++;
            }
        }

        return s.length() == 0 ? 1 : 0;
    }
}
