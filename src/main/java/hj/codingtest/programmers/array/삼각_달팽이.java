package hj.codingtest.programmers.array;

public class 삼각_달팽이 {

//    private static final int[] dx = {0, 1, -1};
//    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n) {

        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int number = 1;
        // 1
        // 2  9
        // 3  10  8
        // 4  5  6  7

        while (true) {
            //아래
            while (true) {
                triangle[y][x] = number++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y += 1;
            }
            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x += 1;

            //오른쪽
            while (true) {
                triangle[y][x] = number++;
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x += 1;
            }
            if (triangle[y - 1][x - 1] != 0) break;
            x -= 1;
            y -= 1;

            //왼쪽위
            while (true) {
                triangle[y][x] = number++;
                if (triangle[y - 1][x - 1] != 0) break;
                x -= 1;
                y -= 1;
            }
            if (triangle[y + 1][x] != 0) break;
            y += 1;
        }

        int[] answer = new int[number -1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
        /*int[][] triangle = new int[n][n];

        int x = 0;
        int y = 0;
        int number = 1;
        int direction = 0;
        // 0: 아래, 1: 오른쪽, 2: 왼쪽 위

        while (true) {

            triangle[y][x] = number++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {

                direction = (direction + 1) % 3;

                nx = x + dx[direction];
                ny = y + dy[direction];

                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                    break;
                }
            }
            x = nx;
            y = ny;
        }

        int[] answer = new int[number - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }
        return answer;*/
    }
}
