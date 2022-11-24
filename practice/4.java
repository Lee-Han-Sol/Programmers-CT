import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0; //2진화 된 횟수
        int length = 0;
        int length_ori = 0;
        int cnt_zero = 0;
        while(!s.equals("1")){
            length_ori = s.length(); // 0 제거하기 전 s의 길이
            s = s.replaceAll("0",""); //0제거
            length = s.length(); // 0 제거한 s의 길이
            cnt_zero += length_ori - s.length(); // 0의 갯수 더해줌
            s = Integer.toBinaryString(length); // 2진화 진행
            cnt++;
        }
        answer[0]=cnt;
        answer[1]=cnt_zero;
        return answer;
    }
    
}
