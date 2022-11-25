class Solution {
    public int solution(int n) {
        int answer = n+1;
        //An < An+1
        //An 과 An+1 의 2진 1의 갯수는 같다.
        
        String binaryStringN = Integer.toBinaryString(n);
        binaryStringN = binaryStringN.replaceAll("0","");
        String binaryStringA = Integer.toBinaryString(answer);
        
        
        while(binaryStringN.length()!=binaryStringA.length()){
            
            binaryStringA = Integer.toBinaryString(answer);
            binaryStringA = binaryStringA.replaceAll("0","");
            
            if(binaryStringN.length()==binaryStringA.length()){
                break;
            }
            
            answer++;
            
        }
        
        return answer;
        
    }
    
}

//효율성에서 문제가 되고 있는중 
//bitCount 메소드 사용하니 

class Solution {
    public int solution(int n) {
        int answer = n+1;
        //An < An+1
        //An 과 An+1 의 2진 1의 갯수는 같다.
        
        
        while(Integer.bitCount(n)!=Integer.bitCount(answer)){
            
            if(Integer.bitCount(n)==Integer.bitCount(answer)){
                break;
            }
            
            answer++;
            
        }
        
        return answer;
        
    }
    
}
