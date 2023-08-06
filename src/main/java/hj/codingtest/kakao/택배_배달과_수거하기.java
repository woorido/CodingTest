package hj.codingtest.kakao;

public class 택배_배달과_수거하기 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {

        long answer = 0;
        int deliver = 0;
        int pickup = 0;
        for (int i = n - 1; i >= 0; i--) { //역순으로 처리하는 이유는 택배의 우선순위를 줄 수 있음
            if (deliveries[i] > 0 || pickups[i] > 0) { //각 택배가 아직 처리되지 않았으면
                int cnt = 0; //해당 택배를 배달하고 수거할 때까지 필요한 이동 횟수 계산
                while (deliver < deliveries[i] || pickup < pickups[i]) { //현재 배달과 수거개수가 목표 개수보다 작을 때까지
                    cnt++;
                    deliver += cap; //cap 만큼 개수 추가
                    pickup += cap;
                }
                //배달과 수거를 완료한 후
                deliver -= deliveries[i]; //해당 택배 개수만큼 deliver 에서 빼줌
                pickup -= pickups[i]; //해당 수거 개수만큼 pickup 에서 빼줌
                System.out.println("cnt = " + cnt);
                answer += (i + 1) * cnt * 2; //택배를 배달하고 수거한 이동횟수 (cnt) 와
                                            // 택배의 인덱스(i+1) 를 곱하고,
                                            // 2를 곱하여 answer 에 더한다 (2를 곱하는 이유는 배달, 수거 모두 고려해야하기 때문이다)

            }
        }

        return answer;
    }
}
