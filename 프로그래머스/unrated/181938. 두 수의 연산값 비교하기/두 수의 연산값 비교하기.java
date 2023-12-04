class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int case1 = Integer.parseInt("" + a + b);
        int case2 = 2 * a * b;
        
        if ( case1 > case2 ) {
            answer = case1;
        } else if ( case1 == case2 ) {
            answer = case1;
        } else {
            answer = case2;
        }
        
        return answer;
    }
}