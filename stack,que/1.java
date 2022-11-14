import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int num = -1; //원소가 0~9까지 이므로 영향 안받는 아무 숫자.
        for(int i=0; i<arr.length; i++){
             if(arr[i] != num){
                 arrList.add(arr[i]);
                 num = arr[i];
             }
        }
        
        answer = new int[arrList.size()]; //answer 리스트 크기 선언.
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i); 
        }
        
        return answer;
    }
}
