import java.util.*;

class Solution {
    public String solution(String s) {
        String ans = "";
        
        // 모든 문자열 소문자로 변경
        String[] srr = s.toLowerCase().split("");
        
        boolean isFirst = true;
        
        for(int i = 0; i < srr.length; i++) {
            // 첫 글자일 경우 대문자로 변경
            ans += isFirst ? srr[i].toUpperCase() : srr[i]; 
            // 공백을 만나면 첫 글자  boolean 값 true로 변경
            isFirst = srr[i].equals(" ") ? true : false;            
        }
        
        return ans;
    }
}
