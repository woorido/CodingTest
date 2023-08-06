package hj.codingtest.programmers.array;

public class 행렬의_곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

//        a = a11 a12
//            a21 a22
//            a31 a32
//        b = b11 b12
//            b21 b22
//        ab = a11b11 + a12b21  a11b12 + a12b22
//             a21b11 + a22b21  a21b12 + a22b22
//             a31b11 + a32b21  a31b12 + a32b22

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];

                }
            }
        }

        return answer;


        /*int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;*/

    }
}
