package hj.codingtest.programmers.recursion;

import java.util.ArrayList;
import java.util.List;

public class 하노이의_탑 {
    //상태 : (n, from, to)
    //옮기려는 원판 개수 : n, 원판이 현재 위치한 기둥 : from, 원판을 옮길 기둥 : to

    //종료조건
    //(1, from, to)

    //점화식
    //(n, from, to)  = (n-1, from, empty) + (1, from, to) + (n-1, empty, to)
    //empty = 6 - from - to => 기둥을 1, 2, 3으로 표현했을 때 이렇게 empty 기둥 번호를 구할 수 있음
    private static void hanoi(int n, int from, int to, List<int[]> process) {
        System.out.println("n out = " + n);
        if (n == 1) {
            System.out.println("n in = " + n + ", from = " + from + ", to = " + to);
            process.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        System.out.println("1");
        hanoi(n - 1, from, empty, process);
        System.out.println("2");
        hanoi(1, from, to, process);
        System.out.println("3");
        hanoi(n - 1, empty, to, process);
        System.out.println("4");

    }

    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }
}
