class Solution {
    public int solution(int n, int t) {        
        int answer = n; //초기 세균 수를 answer에 저장
        // t시간동안 세균수를 2배씩 증가
        for(int i=0; i<t; i++){
            answer*=2; //매 시간마다 두 배로 증가          
        }
        return answer;
    }
}