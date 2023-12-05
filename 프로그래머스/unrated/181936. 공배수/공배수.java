class Solution { 
    public int solution(int number, int n, int m) {
        int answer = 0;
        int number_n = number % n;
        int number_m = number % m;
        
        if ((number_n == 0) && (number_m == 0)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        return answer;
    }
}