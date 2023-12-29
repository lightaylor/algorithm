class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        char[] aArr = A.toCharArray();
        char[] bArr = new char[aArr.length];

        for(int i = 0; i < aArr.length; i++) {
            int count = 0;
            for(int k = aArr.length - i; k < aArr.length; k++) {
                bArr[count++] = aArr[k];
            }
            for (int j = 0; j < aArr.length - i; j++) {
                bArr[count++] = aArr[j];
            }

            if (B.equals(new String(bArr))) {
                return i;
            }
        }

        return answer;
    }
}
