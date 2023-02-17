class Solution {
    /*
     * Date: 2022-03-07
     * Time: 01:11
     */
    public static long solution(int k, int d) {
        return pointing(k, d);
    }
    
    /*
     * 메소드명: 점 찍기
     * 1. 좌표의 최댓값 계산
     * 2. 좌표의 최댓값 / k = 특정 위치에서 찍을 수 있는 좌표의 갯수
     * 3. (0, 0)은 포함이 안되므로 +1
     */
    public static long pointing(int k, int d) {
        // Output Instance
        long output = 0;
        
        for (int i = 0; i <= d; i+=k) {
            int y = (int)Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2));
            output += y/k;
            output += 1;
        }
 
        return output;
    }
}
