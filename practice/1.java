import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] string = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String str : string) {
            System.out.println(str);
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list);
        answer = list.get(0) + " " + list.get(list.size()-1);
        return answer;
    }
}
