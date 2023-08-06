package hj.codingtest.kakao;

public class 이모티콘_할인행사 {
    int[] discount = {10, 20, 30, 40};
    int maxOfSubscribe;
    int maxOfCost;

    public int[] solution(int[][] users, int[] emoticons) {

        for (int[] user : users) {
            int userDiscountRate = user[0];
            int userMaxCost = user[1];
            int maxEmoticons = 0;

            for (int i = 0; i < emoticons.length; i++) {
                for (int j = 0; j < discount.length; j++) {
                    int sum = emoticons[i] / 100 * (100 - discount[j]);
                    maxEmoticons = Math.max(maxEmoticons, sum);

                }
            }

            

//            int subscribe = 0;
//            int cost = 0;
//            int sum = 0;
//
//            for (int i = 0; i < emoticons.length; i++) {
//                for (int j = 0; j < discount.length; j++) {
//                    if (userDiscountRate <= discount[j]) {
//                        sum += emoticons[i] / 100 * (100 - discount[j]);
//                    }
//                }
//
//            }
//
//            if (sum >= userMaxCost) {
//                subscribe++;
//            } else {
//                cost += sum;
//            }
        }
        int[] answer = new int[]{maxOfSubscribe, maxOfCost};

        return answer;
    }

}
