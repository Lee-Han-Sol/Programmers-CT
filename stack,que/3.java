class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100]; //작업의 개수는 100개 이하이므로 100으로 선언
        int day = 0; //temp에 적용할 배포일 수
        
        //각 항목마다 100까지 검사해야하므로 for문안에 while문이 들어간다.
        for(int i=0; i<progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            temp[day]++;
        }
        
        int count = 0;
        
        //temp에 들어간 배열의 길이를 알기위한 코드임.
        //temp는 초기에 0으로 선언되어 있으므로 0이 아닌 값만 측정하면 됨.
        for(int n : temp){//temp배열 값을 하나식 n에 적용
            if(n != 0){ //배열 값이 0이 아니라면
                count ++; //count 증가
            }
        }
        
        int[] answer = new int[count]; //답을 리턴하기 위한 배열 answer 선언
       
        count = 0; //count 0 초기화
        for(int n : temp){
            if(n != 0){
                answer[count++] = n; //answer 배열에 temp 값 넣기
            }
        }
        
        return answer;
    }
}
