class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++){
            answer = (a+b) % 1234567; //선형적
            a = b;
            b = answer;
        }
        return   answer;
    }
}
