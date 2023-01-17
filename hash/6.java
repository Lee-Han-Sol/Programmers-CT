import java.util.*;

class Solution {
       public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();

        // type별로 옷 종류가 몇개인지 세기
        for(int i=0; i<clothes.length; i++){
            String cloth_type = clothes[i][1];
            System.out.println(cloth_type);
            hash.put(cloth_type, hash.getOrDefault(cloth_type, 1) + 1); //입고 안입고 두가지의 경우이므로 기본 1을 준다.
        }

        for (String key : hash.keySet()) {
            answer *= hash.get(key);  // 경우의수 a*b*c
        }

        return answer-1;
    }
}
