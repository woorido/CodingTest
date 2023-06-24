package hj.codingtest.programmers;

public class 삼각_달팽이 {
    public int[] solution(int n) {

        int[][] triangle = new int[n][n];

        int x = 0;
        int y = 0;
        int v = 1;

        while (true) {

            //아래
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == n || triangle[y + 1][x] != 0) {
                    break;
                }
                y += 1;
            }
            if (triangle[y][x + 1] != 0 || x + 1 == n) {
                break;
            }
            x += 1;


            //오른쪽
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == n || triangle[y][x + 1] != 0) {
                    break;
                }
                x += 1;
            }
            if (triangle[y - 1][x - 1] != 0) {
                break;
            }
            x -= 1;
            y -= 1;

            //왼쪽 위
            while (true) {
                triangle[y][x] = v++;
                if (triangle[y - 1][x - 1] != 0) {
                    break;
                }
                x -= 1;
                y -= 1;
            }
            if (y + 1 == n || triangle[y + 1][x] != 0) {
                break;
            }
            y += 1;

        }

        int[] answer = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }
        return answer;
    }
}
