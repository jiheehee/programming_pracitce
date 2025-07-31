import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            list.add(n);
            if (n == 1) break;
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
