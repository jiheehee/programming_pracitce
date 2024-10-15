class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 슬라이딩 윈도우
        // 10일씩 검사
        for (int i = 0; i <= discount.length - 10; i++) {
            boolean matches = true;
            
            // 각 제품이 원하는 수량만큼 있는지 확인해줌
            for (int j = 0; j < want.length; j++) {
                String item = want[j];
                int neededQuantity = number[j];
                int availableQuantity = 0;
                
                // 10일간 할인 제품에서 원하는 제품 수량을 카운트하기
                for (int k = i; k < i + 10; k++) {
                    if (discount[k].equals(item)) {
                        availableQuantity++;
                    }
                }
                
                // 필요한 수량만큼 없는 경우 해당 구간은 무효로 처리함
                if (availableQuantity < neededQuantity) {
                    matches = false;
                    break;
                }
            }
            
            // 모든 제품이 원하는 수량만큼 포함될때
            if (matches) {
                answer++;
            }
        }
        
        return answer;
    }
}
