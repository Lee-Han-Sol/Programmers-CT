public int[] solution(int n, long k) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] result = new int[n];
        int fn = 1;
        for(int i = 1;  i <= n; i++) {
            fn *= i;
            al.add(i);
        }
        k--;
        
        int idx = 0;
        while(n>0) {
            fn /= n;            //n번 째 자리수가 정해짐
            result[idx++] = al.get((int) (k/fn));
            al.remove((int)k/fn);
            k %= fn;
            n--;
        }
        return result;
        
    }
