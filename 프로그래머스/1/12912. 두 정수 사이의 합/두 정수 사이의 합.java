class Solution {
    public long solution(int a, int b) {        
        long sum=0;
        long num=0;
//        int answer=0;
        
        if(a<b){
            for(num=a; num<=b; num++){
                sum+=num;
            }
        }else if(a>b){
            for(num=b; num<=a; num++){
                sum+=num;
            }
        }else{
            sum=a;
        }
        return sum;
        
    }
}