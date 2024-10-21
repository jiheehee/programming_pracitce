class Solution {
    public String solution(String my_string) {
        //주어진 문자를 배열로 바꿈
        char[] charArray=my_string.toCharArray();
        String answer = "";
        
        // 배열을 뒤에부터(거꾸로) 순회하면서 문자열에 추가함
        for(int i=charArray.length-1; i>=0; i--){
            answer+=charArray[i];
        }
        
        return answer;
    }
}