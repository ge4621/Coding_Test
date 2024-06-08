class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        int Max = 0;
        int index = 0;
        
        for(int i=0; i<array.length;i++){
            if(array[i] > Max){
                Max = array[i];
                index = i;
            }
        }
        
        answer[0] = Max;
        answer[1] = index;
        
        return answer;
    }
}