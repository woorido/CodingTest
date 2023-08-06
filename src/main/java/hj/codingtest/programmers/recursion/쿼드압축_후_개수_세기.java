package hj.codingtest.programmers.recursion;

public class 쿼드압축_후_개수_세기 {
    // 상태 : (x, y, size) => 좌표 (x, y) 에서 시작하여 가로 길이와 세로 길이가 size인 정사각형을 압축했을 때 남아있는 0과 1의 개수
    //*종료조건
    //범위 안 원소들이 모두 같은 값을 가질 때 (0또는 1)
    // *점화식
    //

    /*public int[] solution(int[][] arr) {

        
        int startX = 0;
        int startY = 0;

        for (int x = startX; x < startX + arr.length; x++) {
            for (int y = startY; y < startY + arr.length; y++) {
                System.out.println("arr[x][y] = " + arr[x][y]);
                System.out.println("arr[startX][startY] = " + arr[startX][startY]);
            }
        }


        return null;
    }

    private static class Count {
        public final int zero;
        public final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }*/

    private static class Count {
        public final int zero;
        public final int one;

        private Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }

    //부분 문제를 해결할 수 있는 재귀 메서드
    private Count count(int offsetX, int offsetY, int size, int[][] arr) {
        int h = size / 2;
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                // 원소가 섞여있는 경우 반환값
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }
        // 모든 원소가 같은 값을 가지는 경우 : 종료조건
        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }

    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[]{count.zero, count.one};
    }
}
