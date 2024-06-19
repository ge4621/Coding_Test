class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String[] result = String.valueOf(num).split("");
        
        for(int i = 0; i<result.length;i++){
            if(result[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}