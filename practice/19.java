import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        PriorityQueue<Integer> in = new PriorityQueue<>();
        PriorityQueue<Integer> out = new PriorityQueue<>();
        int max=0, cnt=1;
        for(String[] time : book_time) {
            in.offer(helper(time[0]));
            out.offer(helper(time[1])+10);
        }
        while(!out.isEmpty() && !in.isEmpty()) {
            int o=out.poll();
            cnt--;
            while(!in.isEmpty() && in.peek()<o) {
                in.poll();
                cnt++;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public int helper(String str) {
        String[] s = str.split(":");
        return Integer.valueOf(s[1])+Integer.valueOf(s[0])*60;
    }
}
