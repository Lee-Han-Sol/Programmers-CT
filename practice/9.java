class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[60001];
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i < 60001 ; i++){
            dp[i] = (dp[i-1]+dp[i-2])% 1000000007;
        }
        
        return dp[n];
        
    }
    
}
