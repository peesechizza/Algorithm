class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenString = "";
        String oddString = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenString += num_list[i];
            } else {
                oddString += num_list[i];
            }
        }

        answer = Integer.parseInt(evenString) + Integer.parseInt(oddString);
        return answer;
    }
}