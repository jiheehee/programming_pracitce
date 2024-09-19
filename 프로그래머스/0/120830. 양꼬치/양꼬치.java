class Solution {
    public int solution(int n, int k) {
        int sheep = 12000*n;
        int num=0;
        if(n>=10){
            num=n/10;
        }else{
            num=0;
        }
        int drink=2000*(k-num);        
        int answer = sheep+drink;
        return answer;
    }
}