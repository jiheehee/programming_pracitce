import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        //리스트에다가 결과를 담음
        //false인 할일이 몇개인지 모르니까 ArrayList로 선언해줌
        List<String> answer=new ArrayList<>();
        
        //finished배열에서 순회하면서 false인것을 찾아서, 
        //todo_list에 해당된는 할일을 answer에 넣어줌
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){            
                answer.add(todo_list[i]);                
            }
        }
        return answer.toArray(new String[0]);
    }
}