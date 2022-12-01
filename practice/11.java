import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> st = new Stack<>();
        
        for(int i=0 ; i< s.length() ; i++){
            
            if(st.isEmpty() || s.charAt(i) != st.peek()){
                st.push(s.charAt(i));
            }
            
            else if(s.charAt(i) == st.peek()){
                st.pop();
            }
            
        }
        answer = st.isEmpty() ? 1 : 0;
        
        return answer;
    }
}
