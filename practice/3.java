import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0 ; i < A.length ; i++){
            answer += A[i] * B[A.length-1-i];
        }
        
        return answer;
    }
}

//내림차순을 사용할땐 Wrapper클래스로만 사용되므로
class Solution
{    
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 1. B 배열은 내림차순 정렬.
        Integer[] b = new Integer[B.length];
        
        // 2. Collections.sort()를 위해 Wrapper클래스 배열에 저장.
        for(int i = 0 ; i<b.length;i++)
            b[i] = B[i];
        
        // 3. A 배열은 오름차순 정렬.
        Arrays.sort(A);
        // 4. b 배열은 내림차순 정렬.
        Arrays.sort(b,Collections.reverseOrder());
        
        // 5. 최솟값을 만들기 위해 배열의 길이만큼 각 배열의 값을 곱한 뒤, 더해준다.
        for(int i = 0;i<A.length;i++){
            answer+=(A[i] * b[i]);
        }        

        return answer;
    }
}
