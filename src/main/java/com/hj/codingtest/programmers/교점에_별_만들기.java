package com.hj.codingtest.programmers;

import java.util.*;

public class 교점에_별_만들기 {
     private static class Point{
        public final long x, y;
    
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {

        double x = (double) (b1*c2 - c1*b2) / (a1*b2 - b1*a2);
        double y = (double) (c1*a2 - a1*c2) / (a1*b2 - b1*a2);

        if(x % 1 != 0 || y % 1 != 0) {
            return null;
        }

        return new Point((long) x,(long) y);
    }
    
    public String[] solution(int[][] line) {
        
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1 ; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if(intersection!=null){
                    points.add(intersection);
                }
            }
        }

        //2차원 배열 크기 
        Point maximum = getMaximumPoint(points);
        Point minimum = getMinimumPoint(points);

        //배열 크기이므로 +1
        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point point : points) {
            int x = (int) (point.x - minimum.x);
            int y = (int) (maximum.y - point.y);
            System.out.println(arr);
            arr[y][x] = '*';
        }

        String[] answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }

    public Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        for (Point point : points) {
            if(x < point.x) x = point.x;
            if(y < point.y) y = point.y;
        }
        return new Point(x, y);
    }

    public Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        for (Point point : points) {
            if(x > point.x) x = point.x;
            if(y > point.y) y = point.y;
        }
        return new Point(x, y);
    }

}
