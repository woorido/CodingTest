package hj.codingtest.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 순위_탐색 {
    public int[] solution(String[] info, String[] query) {

        // info 기반으로 hashmap 생성
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

        for (String i : info) {
            String[] data = i.split(" ");
            String[] languages = {data[0], "-"};
            String[] jobs = {data[1], "-"};
            String[] exps = {data[2], "-"};
            String[] foods = {data[3], "-"};
            Integer value = Integer.parseInt(data[4]);

            for (String language : languages) {
                for (String job : jobs) {
                    for (String exp : exps) {
                        for (String food : foods) {
                            String[] keyData = {language, job, exp, food};
                            String key = String.join(" ", keyData);
                            ArrayList<Integer> arr = hashMap.getOrDefault(key, new ArrayList<>());

                            arr.add(value);
                            hashMap.put(key, arr);

                        }
                    }
                }
            }
        }

        // 오름차순으로 정렬
        for (ArrayList<Integer> value : hashMap.values()) {
            Collections.sort(value);
        }


        // query 조건에 맞는 지원자 가져오기
        int[] answer = new int[query.length];
        int i = 0;
        for (String q : query) {
            String[] data = q.split(" and ");
            int target = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);

            if (hashMap.containsKey(key)) {
                ArrayList<Integer> list = hashMap.get(key);
                // binary search 를 통해 lower-bound 찾기
                int left = 0;
                int right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= target) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                answer[i] = list.size() - left;
            }
            i++;
        }

        return answer;
    }
}
