import java.util.*; 

class Solution {
    public String solution(int[] numbers) {
    
        String answer = "";
        String []res =new String[numbers.length];
        
        //문자열로 변경
        for(int i=0; i<numbers.length; i++){
            res[i]=String.valueOf(numbers[i]);
          
        }
        //문자열을 합쳤을 때  비교
        Arrays.sort(res, (a,b)->{
            return (a+b).compareTo(b+a);
        }
        );
        
       //정렬한 값 더하기
       
        for(int i=numbers.length-1; i>=0; i--){
            answer+=res[i];
        }
        
        //ex) 000인 경우 0으로 리턴
        if(answer.charAt(0)=='0') return "0";
        
        return answer;
    }
}
