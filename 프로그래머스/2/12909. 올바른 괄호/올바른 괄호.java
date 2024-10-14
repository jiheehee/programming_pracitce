class Solution {
    boolean solution(String s) {
        //boolean answer = true;
        
        int openCount=0;
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='('){
                openCount++;
            }else{
                openCount--;
                if(openCount<0){
                    return false;
                }
            }
        }

        return openCount==0;
    }
}