class Solution {
    
    // 최대 공약수
    public int GCD(int a, int b){      
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0)      return a;
        else            return GCD(b, a%b);
    }
    
    // 최소 공배수 - a*b / 최대공약수
    public int LCM(int a, int b){
        return a*b / GCD(a, b);
    }
    
  public int solution(int[] arr) {
      int answer = arr[0];
      for(int i=1; i<arr.length; i++)
          answer = LCM(answer, arr[i]);
      return answer;
  }
}
