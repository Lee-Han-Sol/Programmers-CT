import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer,Integer> my = new HashMap<>(); // 자신의 맛종류 및 갯수
        HashSet<Integer> bro = new HashSet<>(); // 형의 케이크 맛종류
        
        for(int s : topping) {
            my.put(s, my.getOrDefault(s, 0) + 1); // 전부 자신의 배열에 일단 넣음
        }
        
        for(int slice : topping) { // 앞에서 부터 자름
          
            bro.add(slice);
            my.put(slice, my.get(slice) - 1);
          
            if(my.get(slice) == 0 ){ // 해당 맛 갯수가 0이면 종류를 제거
                my.remove(slice);
            }
          
            if(bro.size() == my.size()) { // 종류가 같으면 카운트
                answer++;
            }
          
            if(bro.size() > my.size()) { // 형의 맛 종류가 많아지면 더이상 의미 없음
                break;
            }
            
        }
        
        System.out.println(my);
      
        return answer;
    }
}
