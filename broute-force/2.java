import java.util.*;

class Solution {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        
        int max = Math.max(score[0], Math.max(score[1],score[2]));
        
        List<Integer> list = new ArrayList<Integer>();
        for( int j=0; j < 3 ; j++ ){
            if (max == score[j]){
             list.add(j+1);
            }
        }
        
        int[] answers = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answers[i] = list.get(i);
        }
        
        return answers;
        
    }
    
}
