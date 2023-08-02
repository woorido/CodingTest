package hj.codingtest.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        //중복제거
        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report) {
            reportSet.add(rep);
        }

        //notifyListHash 생성 <reportee, reporters>
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap();
        for (String rep : reportSet) {
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx++);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if (reporterList == null) reporterList = new ArrayList<>();
            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        //notifyListHash 기반으로 reporter Hast 생성
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values()) {
            if (notifyList.size() >= k) {
                for (String reporter : notifyList) {
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        //reporter Hash 기반으로 결과 도출
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
