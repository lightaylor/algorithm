package silver.level1.test_2527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            Rectangle rect1 = new Rectangle(x1, y1, x2, y2);

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            Rectangle rect2 = new Rectangle(x1, y1, x2, y2);

            System.out.println(getOverlapType(rect1, rect2));

        }
    }

    private static String getOverlapType(Rectangle rect1, Rectangle rect2) {
        // 1. 두 직사각형이 전혀 겹치지 않는 경우
        if (rect1.x2 < rect2.x1 || rect1.x1 > rect2.x2 || rect1.y2 < rect2.y1 || rect1.y1 > rect2.y2) {
            return "d"; // 공통 부분 없음
        }

        // 2. 겹치는 부분이 점인지 확인 (두 직사각형의 꼭짓점에서만 만나는 경우)
        if ((rect1.x2 == rect2.x1 || rect1.x1 == rect2.x2) && (rect1.y2 == rect2.y1 || rect1.y1 == rect2.y2)) {
            return "c"; // 공통 부분이 점
        }

        // 3. 겹치는 부분이 선분인지 확인 (한쪽 축에서만 겹치는 경우)
        if (rect1.x2 == rect2.x1 || rect1.x1 == rect2.x2) { // x축에서만 겹치는 경우
            return "b"; // 공통 부분이 선분
        }
        if (rect1.y2 == rect2.y1 || rect1.y1 == rect2.y2) { // y축에서만 겹치는 경우
            return "b"; // 공통 부분이 선분
        }

        // 4. 겹치는 부분이 직사각형인 경우
        return "a"; // 공통 부분이 직사각형
    }

    private static class Rectangle {
        int x1, y1, x2, y2;

        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}
