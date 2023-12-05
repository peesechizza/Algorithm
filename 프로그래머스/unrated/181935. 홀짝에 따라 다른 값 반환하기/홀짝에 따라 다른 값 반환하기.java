class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_odd = 0;
        int n_even = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                n_odd += i;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                n_even += (i * i);
            }
        }
        
        if ( n % 2 == 1 ) {
            answer = n_odd;
        } else {
            answer = n_even;
        }
        
        return answer;
    }
}