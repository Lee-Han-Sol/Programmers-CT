import java.util.*;

class Solution {
    boolean solution(String s) {
        //s의 시작이 "(", 끝이 ")", "("의 개수와 ")"가 같으면된다
        
        // int a = s.length() - s.replace("(", "").length(); 
        // int b = s.length() - s.replace(")", "").length();
        // if(s.startsWith("(") && s.endsWith(")") && a == b){
        //     return true;
        // }
        int count = 0;
        for(int i = 0; i < s.length() ; i++) {
            
            if(s.charAt(i) == '(')
                count++;
            if(s.charAt(i) == ')')
                count--;
            if(count < 0 )
                break;
        }
        if(count == 0) {
            return true;
        }
        return false;
    }
}
