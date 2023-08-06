package hj.codingtest.kakao;

public class 키패드_누르기 {
    Position left;
    Position right;
    Position numberPosition;

    public String solution(int[] numbers, String hand) {
        //     0  1  2
        // 0   1  2  3
        // 1   4  5  6
        // 2   7  8  9
        // 3   *  0  #

        String answer = "";
        left = new Position(3, 0);
        right = new Position(3, 2);

        for (int number : numbers) {
            numberPosition = new Position((number - 1) / 3, (number - 1) % 3);
            if (number == 0) {
                numberPosition = new Position(3, 1);
            }
            String finger = numberPosition.getPosition(hand);
            answer += finger;
            if (finger.equals("L")) {
                left = numberPosition;
            } else if (finger.equals("R")) {
                right = numberPosition;
            }
        }
        return answer;
    }

    class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String getPosition(String hand) {
            String finger = hand.equals("right") ? "R" : "L";

            if (this.col == 0) {
                finger = "L";
            } else if (this.col == 2) {
                finger = "R";
            } else {
                int leftDistance = left.getDistance(this);
                int rightDistance = right.getDistance(this);

                if (leftDistance < rightDistance) {
                    finger = "L";
                } else if (rightDistance < leftDistance) {
                    finger = "R";
                }
            }
            return finger;
        }

        private int getDistance(Position position) {
            return Math.abs(position.col - this.col) + Math.abs(position.row - this.row);
        }
    }

}
