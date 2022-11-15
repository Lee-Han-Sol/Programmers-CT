import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //최대 값이 우선순위인 큐 = 최대 힙, 최소 값이 우선순위인 큐 = 최소 힙
        
        //자동오름차순정렬
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for (int i=0; i<scoville.length; i++) {
            minHeap.add(scoville[i]);
        }
        
        while (minHeap.peek() < K) {
            //제일낮은값, 제일낮은값+1 빼기
            int min1 = minHeap.poll();
            int min2 = minHeap.poll();
            
            //힙에 넣기
            minHeap.add(min1 + min2*2);
            answer++;
            
            //제일 낮은 값이 K이상이면 끝
            if (minHeap.peek() >= K) {
                break;
            }
            
            //마지막 수가 K보다 작을 때
            if (minHeap.peek() < K && minHeap.size() == 1) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
