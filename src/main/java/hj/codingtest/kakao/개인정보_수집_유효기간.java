package hj.codingtest.kakao;

import java.util.ArrayList;
import java.util.HashMap;

public class 개인정보_수집_유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> info = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (String term : terms) {
            String[] split = term.split(" ");
            info.put(split[0], Integer.parseInt(split[1]));
        }

        int getTodayDate = getDate(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String collectDate = split[0];
            String type = split[1];

            int expirationDate = info.get(type) * 28;
            int getCollectDate = getDate(collectDate);

            if ((expirationDate + getCollectDate) <= getTodayDate) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
