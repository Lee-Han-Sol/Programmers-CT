import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        int [] order = {4,3,1,2,5};
        solution(order);
    }


    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> conStack = new Stack<>();
        int i = 0;

        for(int box = 1; box <= order.length; box++)
        {
            if(order[i] != box){
                //0부터 시작 -> box와 같지 않을 경우 스택에 넣음 
                conStack.add(box);
                continue;
            }

            //box 같아질 때까지 계속 컨테이너에 넣다가 i 증가시키고 나서 정답도 하나 추가함
            i++;
            answer++;
            


            while (conStack.size() != 0 && order[i] == conStack.peek())
            {
                //continue를 안 쓰면 이 while문을 매번 체크하니까 continue를 씀
                //컨테이너 벨트가 비어있지 않고 && 스택의 맨 마지막 애가 현재 order[i] 랑 같으면 실행
                conStack.pop();
                i++;
                answer++;
            }
        }

        return answer;
    }
}
